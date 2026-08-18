class Solution {
    public int largestInteger(int[] nums, int k) {
        int n =nums.length;
        int[] windowCnt = new int[51];
        for(int i=0; i<=n-k; i++){
            boolean[] seen = new boolean[51];
            for(int j=i; j<i+k; j++){
                if(!seen[nums[j]]){
                    seen[nums[j]] = true;
                    windowCnt[nums[j]]++;
                }
            }
        }

        int ans = -1;
        for(int i=0; i<51; i++){
            if(windowCnt[i] == 1){
                ans = Math.max(ans , i);
            }
        }
        return ans;
    }
}