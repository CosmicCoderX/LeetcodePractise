class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int num: nums){
            min = Math.min(min, num);
        }

        int move = 0;
        for(int n: nums){
            move += n - min;
        }
        return move;
    }
}