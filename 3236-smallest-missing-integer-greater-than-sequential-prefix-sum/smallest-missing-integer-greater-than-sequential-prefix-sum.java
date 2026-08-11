class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                sum+=nums[i];
            }else{
                break;
            }
        }

        int x = sum;
        while(true){
            boolean fnd = false;
            for(int num:nums){
                if(num==x){
                    fnd = true;
                    break;
                }
            }

            if(fnd==false){
                return x;
            }

            x+=1;
        }
    }
}