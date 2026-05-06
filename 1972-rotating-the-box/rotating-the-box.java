class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;

        // Step 1: Rotate 90 degree clockwise
        char[][] rotatedBox = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedBox[i][j] = boxGrid[n - 1 - j][i];
            }
        }

        // Step 2: Apply gravity downward
        for (int col = 0; col < n; col++) {
            for (int row = m - 1; row >= 0; row--) {
                if (rotatedBox[row][col] == '.') {
                    int stoneRow = -1;

                    // search upward for nearest stone
                    for (int k = row - 1; k >= 0; k--) {
                        if (rotatedBox[k][col] == '*') {
                            break;
                        }

                        if (rotatedBox[k][col] == '#') {
                            stoneRow = k;
                            break;
                        }
                    }

                    // move stone downward
                    if (stoneRow != -1) {
                        rotatedBox[row][col] = '#';
                        rotatedBox[stoneRow][col] = '.';
                    }
                }
            }
        }

        return rotatedBox;
    }
}