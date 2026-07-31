class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];
        for(char ch: word.toCharArray()){
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);

        int totalPush = 0;
        for(int i=0; i<26; i++){
            int currfreq = freq[25-i];
            if(currfreq == 0) break;
            int pushCost = (i/8) + 1;
            totalPush += pushCost * currfreq;

        }

        return totalPush;
    }
}