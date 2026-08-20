class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2; i<n; i++){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }

        int s1 = arr1.size();
        for(int i=0; i<n; i++){
            if(i<s1){
                ans[i] = arr1.get(i);
            }else{
                ans[i] = arr2.get(i-s1);
            }
        }
        
        return ans;
    }
}