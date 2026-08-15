class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int ans = 0;
        for(int r =0; r<s.length(); r++){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            while(map.get(ch) > 2){
                char leave = s.charAt(l);
                map.put(leave, map.getOrDefault(leave, 0)-1);
                l++;
            }

            int len = r - l +1;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}