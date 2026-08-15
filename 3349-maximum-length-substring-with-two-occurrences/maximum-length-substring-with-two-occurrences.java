class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int l = 0;
        int ans = 0;
        for(int r =0; r<s.length(); r++){
            char ch = s.charAt(r);
            freq[ch - 'a']++;

            while(freq[ch - 'a'] > 2){
                char leave = s.charAt(l);
                freq[leave - 'a']--;
                l++;
            }

            int len = r - l +1;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}