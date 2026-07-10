class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<=n-k; i++){
            int currSum = 0;
            for(int j=i; j<i+k; j++){
                currSum += nums[j]; 
            }

            maxSum = Math.max(maxSum, currSum);
        }

        return (double) maxSum/k;
    }
}