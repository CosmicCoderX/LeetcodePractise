class Solution {
    public int findMaxLength(int[] nums) {
        //Prefix Balance Pattern
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int balance = 0;
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                balance++;
            }else{
                balance--;
            }

            if(map.containsKey(balance)){
                maxLen = Math.max(maxLen, i - map.get(balance));
            }else{
                map.put(balance, i);
            }
        }
        return maxLen;
    }
}