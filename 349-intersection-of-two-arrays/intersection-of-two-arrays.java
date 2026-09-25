class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums1){
            set.add(num);
        }

        List<Integer> ls = new ArrayList<>();
        for(int x: nums2){
            if(set.remove(x)){
                ls.add(x);
            }
        }

        int[] ans = new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}