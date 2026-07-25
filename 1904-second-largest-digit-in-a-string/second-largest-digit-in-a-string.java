class Solution {
    public int secondHighest(String s) {
        int maxVal = -1;
        int secondMax = -1;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                int d = ch - '0';
                if(d > maxVal){
                    secondMax = maxVal;
                    maxVal = d;
                }else if(d < maxVal && d > secondMax){
                    secondMax = d;
                }
            }
        }
        return secondMax;
    }
}