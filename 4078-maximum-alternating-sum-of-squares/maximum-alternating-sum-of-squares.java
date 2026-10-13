class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);
        
        int k = n/2;
        long score = 0;
        for(int i=0; i<k; i++){
            score -= nums[i]*nums[i];
        }

        for(int i=k; i<n; i++){
            score += nums[i]*nums[i];
        }
        return score;
    }
}