class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num: nums){
            sum+=num;
        }
        int score1 = solve(0, n-1, nums);
        int score2 = sum - score1;
        return score1 >= score2;
    }
    public int solve(int i, int j, int[] nums){
        if(i>j) return 0;
        if(i == j) return nums[i];
        int take_i = nums[i] + Math.min(solve(i+1, j-1, nums), solve(i+2, j, nums));
        int take_j = nums[j] + Math.min(solve(i+1, j-1, nums), solve(i, j-2, nums));
        return Math.max(take_i, take_j);
    }
}