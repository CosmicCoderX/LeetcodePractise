class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        for(int num:nums){
            total+=num;
        }

        int prefix = 0;
        for(int i=0; i<nums.length; i++){
            prefix+=nums[i];
            int left = prefix - nums[i];
            int right = total - prefix;

            if(left == right) return i;
        }
        return -1;
    }
}