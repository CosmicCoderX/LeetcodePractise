class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private HashMap<Integer, Integer> map2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map2 = new HashMap<>();

        for(int num: nums2){
            map2.put(num, map2.getOrDefault(num, 0)+1);
        }
    }
    
    public void add(int index, int val) {
        int oldE = nums2[index];
        int newE = oldE + val;

        nums2[index] = newE;

        map2.put(oldE, map2.getOrDefault(oldE, 0)-1);
        map2.put(newE, map2.getOrDefault(newE, 0)+1);
    }
    
    public int count(int tot) {
        int pairs = 0;
        for(int x:nums1){
            int compliment = tot - x;
            pairs += map2.getOrDefault(compliment, 0);
        }
        return pairs;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */