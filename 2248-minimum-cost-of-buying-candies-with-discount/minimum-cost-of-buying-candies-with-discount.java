class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0, cnt = 0;
        for(int i=cost.length-1; i>=0; i--){
            cnt++;
            if(cnt%3 == 0) continue;
            res+=cost[i];
        }
        return res;
    }
}