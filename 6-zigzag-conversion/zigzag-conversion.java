class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean direction = false;

        for(int i=0; i<s.length(); i++){
            rows[currRow].append(s.charAt(i));

            if(currRow == 0 || currRow == numRows-1){
                direction = !direction; //ulta kardo
            }

            currRow += direction ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder row: rows){
            res.append(row);
        }

        return res.toString();
    }
}