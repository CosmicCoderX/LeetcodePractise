class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> seen = new HashSet<>();
        int special = 0;
        for(char ch: word.toCharArray()){
            if(seen.contains(ch)){
                continue;
            }else{
                seen.add(ch);
            }
        }

        for(char ch='a'; ch<='z'; ch++){
            if(seen.contains(Character.toLowerCase(ch)) && seen.contains(Character.toUpperCase(ch))){
                special+=1;
            }
        }
        return special;
    }
}