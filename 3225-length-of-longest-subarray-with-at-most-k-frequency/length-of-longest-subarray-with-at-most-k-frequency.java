class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int ans = 0;
        for(int r = 0; r<nums.length; r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while(map.get(nums[r]) > k){
                map.put(nums[l], map.getOrDefault(nums[l], 0) - 1);
                l++;
            }

            int len = r - l + 1;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}