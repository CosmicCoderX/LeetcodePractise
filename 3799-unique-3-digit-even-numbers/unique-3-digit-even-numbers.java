class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        int[] freq = new int[10];
        for(int d: digits){
            freq[d]++;
        }

        int cnt = 0;
        for(int i=100; i<1000; i+=2){
            int d1 = i/100; //hundred's digit
            int d2 = (i/10)%10; //ten's digit
            int d3 = i%10; //one's digit

            int[] needed = new int[10];
            needed[d1]++;
            needed[d2]++;
            needed[d3]++;

            if(freq[d1] >= needed[d1] && freq[d2] >= needed[d2] && freq[d3] >= needed[d3]){
                cnt++;
            }
        }
        return cnt;
    }
}