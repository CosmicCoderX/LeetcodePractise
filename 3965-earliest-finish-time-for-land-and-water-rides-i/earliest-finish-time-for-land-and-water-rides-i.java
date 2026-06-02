class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int minLand = Integer.MAX_VALUE;
        int minWater = Integer.MAX_VALUE;
        for(int i=0; i<landStartTime.length; i++){
            minLand = Math.min(minLand, landStartTime[i] + landDuration[i]);
        }
        for(int i=0; i<waterStartTime.length; i++){
            minWater = Math.min(minWater, waterStartTime[i] + waterDuration[i]);
        }

        for(int i=0; i<landStartTime.length; i++){
            ans = Math.min(ans , Math.max(minWater, landStartTime[i]) + landDuration[i]);
        }
        for(int i=0; i<waterStartTime.length; i++){
            ans = Math.min(ans , Math.max(minLand, waterStartTime[i]) + waterDuration[i]);
        }
        return ans;
    }
}