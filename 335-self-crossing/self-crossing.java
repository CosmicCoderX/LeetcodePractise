class Solution {
    public boolean isSelfCrossing(int[] distance) {
        int n=distance.length;
        if(n < 4) return false;
        for(int i=3; i<n; i++){
            //Case-1: Normal crossing with i-3
            if(distance[i] >= distance[i-2] && distance[i-1] <= distance[i-3]){
                return true;
            }

            //Case 2: Touching/overlapping with i-4
            if(i >=4 && distance[i-1] == distance[i-3] 
                    && distance[i] + distance[i-4] >= distance[i-2]){
                return true;
            }

            //Case 3: Crossing after the spiral starts shrinking, involving i-5
            if(i>=5 && distance[i-2] >= distance[i-4] 
                    && distance[i] >= distance[i-2]-distance[i-4] 
                    && distance[i-1] >= distance[i-3]-distance[i-5] 
                    && distance[i-1] <= distance[i-3]){
                return true;
            }
        }
        return false;
    }
}