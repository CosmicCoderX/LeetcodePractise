class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int second = findSecond(nums, target);
        return new int[]{first, second};
    }

    public int findFirst(int[] nums, int target){
        int first = -1;
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                first = mid;
                r = mid-1; //left mein dekho
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return first;
    }

    public int findSecond(int[] nums, int target){
        int second = -1;
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                second = mid;
                l = mid+1; //right mein dekho
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return second;
    }
}