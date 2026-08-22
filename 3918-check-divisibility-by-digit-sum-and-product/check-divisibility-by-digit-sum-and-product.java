class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int temp=n;
        while(n>0){
            int d = n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        int ans = sum + prod;
        if(temp % ans == 0){
            return true;
        }else{
            return false;
        }
    }
}