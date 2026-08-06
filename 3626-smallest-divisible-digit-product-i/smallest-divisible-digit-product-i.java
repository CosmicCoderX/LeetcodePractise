class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=100; i++){
            int temp = i;
            int prod = 1;
            while(temp>0){
                int d = temp%10;
                prod *= d;
                temp/=10;
            }
            if(prod % t == 0){
                return i;
            }
        }
        return 0;
    }
}