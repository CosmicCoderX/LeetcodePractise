class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int[] res = new int[queries.length];

        Arrays.sort(logs, (a,b) -> Integer.compare(a[1], b[1]));
        int[][] sortedQuery = new int[queries.length][2];
        for(int i=0; i<queries.length; i++){
            sortedQuery[i][0] = queries[i];
            sortedQuery[i][1] = i;
        }

        Arrays.sort(sortedQuery, (a,b) -> Integer.compare(a[0], b[0]));
        int[] cnt = new int[n+1];
        int activeServers = 0;
        int left = 0;
        int  right = 0;

        for(int i=0; i<queries.length; i++){
            int qTime = sortedQuery[i][0];
            int originalIdx = sortedQuery[i][1];
            int windowStart= qTime - x;

            while(right < logs.length && logs[right][1] <= qTime){
                int serverId = logs[right][0];
                if(cnt[serverId] == 0){
                    activeServers++;
                }
                cnt[serverId]++;
                right++;
            }

            while(left < logs.length && logs[left][1] < windowStart){
                int serverId = logs[left][0];
                cnt[serverId]--;
                if(cnt[serverId] == 0){
                    activeServers--;
                }
                left++;
            }

            res[originalIdx] = n - activeServers;
        }

        return res;

    }
}