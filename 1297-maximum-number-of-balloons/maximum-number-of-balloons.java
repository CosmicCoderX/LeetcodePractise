class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char ch: text.toCharArray()){
            freq[ch - 'a']++;
        }
        
        int countB = freq['b' - 'a'];
        int countA = freq['a' - 'a'];
        int countL = freq['l' - 'a'] /2;
        int countO = freq['o' - 'a'] /2;
        int countN = freq['n' - 'a'];

        
        int min = Math.min(countB, Math.min(countA, Math.min(countL, Math.min(countO, countN))));
        return min;
    }
}