class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n =s.length();
        int active = 0;
        int prevZero = Integer.MIN_VALUE;
        int maxPair = 0;

        int i = 0;

        while(i<n){
            int j = i;
            while(j<n && s.charAt(j) == s.charAt(i)){
                j++;
            }

            int len = j - i;
            if(s.charAt(i) == '1'){
                active += len;
            }else{
                maxPair = Math.max(maxPair, prevZero + len);
                prevZero = len;
            }
            i = j;
        }

        return maxPair + active;
    }
}