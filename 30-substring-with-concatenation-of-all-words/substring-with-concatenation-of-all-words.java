class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        // Approach: Brute Force + HashMap Frequency Matching

        int wordLen = words[0].length();  // Length of one word
        int totalLen = wordLen * words.length;  // Total length of concatenated substring

        // Frequency map of given words
        HashMap<String, Integer> wordCnt = new HashMap<>();
        for(String word: words){
            wordCnt.put(word, wordCnt.getOrDefault(word, 0)+1);
        }

        List<Integer> res = new ArrayList<>();

        // Check every possible starting index
        for(int i=0; i<=s.length()-totalLen; i++){

            // Frequency map for current window
            HashMap<String, Integer> currCnt = new HashMap<>();

            // Extract words of size wordLen
            for(int j=0; j<words.length; j++){
                String part = s.substring(i+j*wordLen, i+(j+1)*wordLen);

                // Count extracted words
                currCnt.put(part, currCnt.getOrDefault(part, 0)+1);
            }

            // Valid concatenation found
            if(currCnt.equals(wordCnt)){
                res.add(i);
            }
        }
        return res;
    }
}