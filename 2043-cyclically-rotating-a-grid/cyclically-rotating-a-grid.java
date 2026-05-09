class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;

        while(startRow <= endRow && startCol <= endCol){
            List<Integer> layer = new ArrayList<>(); //empty list

            //Extracting layer
            //first row
            for(int j=startCol; j<=endCol; j++){
                layer.add(grid[startRow][j]);
            }

            //right col
            for(int i=startRow+1; i<=endRow-1; i++){
                layer.add(grid[i][endCol]);
            }

            //bottom row
            for(int j=endCol; j>=startCol; j--){
                layer.add(grid[endRow][j]);
            }

            //left Col
            for(int i=endRow-1; i>=startRow+1; i--){
                layer.add(grid[i][startCol]);
            }

            //Rotating each layer
            int size = layer.size();
            int rot = k%size;

            List<Integer> rotated = new ArrayList<>(); //empty list for rotating
            for(int i=0; i<size; i++){
                rotated.add(layer.get((i+rot)%size));
            }

            //Puting back values
            //first row
            int idx = 0;
            for(int j=startCol; j<=endCol; j++){
                grid[startRow][j] = rotated.get(idx);
                idx++;
            }

            //right col
            for(int i=startRow+1; i<=endRow-1; i++){
                grid[i][endCol] = rotated.get(idx);
                idx++;
            }

            //bottom row
            for(int j=endCol; j>=startCol; j--){
                grid[endRow][j] = rotated.get(idx);
                idx++;
            }

            //left Col
            for(int i=endRow-1; i>=startRow+1; i--){
                grid[i][startCol] = rotated.get(idx);
                idx++;
            }

            //move to inner layer
            startRow+=1;
            endCol-=1;
            endRow-=1;
            startCol+=1;

        }
        return grid;
        
    }
}