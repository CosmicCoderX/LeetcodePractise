class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int cnt = 0;
        int maxEnd = 0;

        Arrays.sort(intervals, (a, b) -> {
            if(a[0] == b[0]){
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for(int i=0; i<intervals.length; i++){
            int currEnd = intervals[i][1];

            if(currEnd > maxEnd){
                maxEnd = currEnd;
                cnt++;
            }

        }
        return cnt;
    }
}