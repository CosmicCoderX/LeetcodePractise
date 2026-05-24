class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String curr = s.substring(i,j+1);
                if(isPalindromic(curr) && curr.length() > res.length()){
                     res = curr;
                }
            }
        }
        return res;
    }

    public boolean isPalindromic(String str){
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}