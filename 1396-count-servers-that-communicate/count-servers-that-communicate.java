class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int total = 0;
        int isIsolated = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    total++;
                    boolean communicated = false;

                    //same row mein dekho
                    for(int k=0; k<m; k++){
                        if(k != j && grid[i][k] == 1){
                            communicated = true;
                            break;
                        }
                    }

                    if(!communicated){
                        //same column mein dekho
                        for(int k=0; k<n; k++){
                            if(k != i && grid[k][j] == 1){
                                communicated = true;
                                break;
                            }
                        }
                    }

                    if(!communicated){
                        isIsolated++;
                    }
                }
            }
        }

        return total - isIsolated;
    }
}