class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
            set.add(num);
        }

        for(int i=min; i<=max; i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}