class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        //pehle n-1 tak sare elements check karo
        for(int i=0; i<n-1; i++){
            if(nums[i] != i+1){
                return false;
            }
        }

        //last element n-1 ke equal hona chahiye
        return nums[n-1] == n-1;
    }
}