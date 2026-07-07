class Solution {
    public long sumAndMultiply(int n) {
        long x =0, sum =0;
        String str = String.valueOf(n);
        for(char ch: str.toCharArray()){
            int num = ch - '0';
            if(num != 0){
                sum+=num;
                x=(x*10)+num;
            }
        }
        return x*sum;
    }
}