class Solution {
    public long countCommas(long n) {
        long thres = 1000L;
        long commas = 0;
        while(n >= thres){
            commas += (n - thres + 1);
            if(thres >  Long.MAX_VALUE/1000) break;
            thres*=1000L;
        }
        return commas;
    }
}