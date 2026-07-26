class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i] < min){
                secondMin = min;
                min = nums[i];
            }else if(nums[i] < secondMin){
                secondMin = nums[i];
            }

            if(nums[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            }else if(nums[i] > secondMax){
                thirdMax = secondMax;
                secondMax = nums[i];
            }else if(nums[i] > thirdMax){
                thirdMax = nums[i];
            }
        }

        return Math.max(max*secondMax*thirdMax, min*secondMin*max);
    }
}