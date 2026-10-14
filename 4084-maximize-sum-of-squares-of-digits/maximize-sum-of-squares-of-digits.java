class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        if(num*9 < sum) return "";
        while(num-- > 0){
            if(sum > 9){
                sum-=9;
                ans.append(9);
            }else{
                ans.append(sum);
                sum = 0;
            }

        }
        return ans.toString();
    }
}