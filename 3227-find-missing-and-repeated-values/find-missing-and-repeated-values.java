class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();
        int repeated = 0, missing = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(set.contains(grid[i][j])){
                    repeated = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }

        for(int i=1; i<=n*n; i++){
            if(!set.contains(i)){
                missing = i;
                
            }
        }

        return new int[]{repeated, missing};
    }
}