class Solution {
    public int majorityElement(int[] nums) {
        //Boyre-Moore Majority Voting Algorithm
        int n = nums.length;
        int candidate = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(cnt == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                cnt++;
            }else{
                cnt--;
            }
        }
        return candidate;
    }
}