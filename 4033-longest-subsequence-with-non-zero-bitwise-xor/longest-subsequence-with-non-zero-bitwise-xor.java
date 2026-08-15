class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int nonZero = 0;
        for(int num: nums){
            if(num != 0){
                nonZero++;
            }
            sum^=num;
        }

        if(sum != 0){
            return n;
        }else if(sum == 0 && nonZero > 0){
            return n-1;
        }else{
            return 0;
        }
    }

}