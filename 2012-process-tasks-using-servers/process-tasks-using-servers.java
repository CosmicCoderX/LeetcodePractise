class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;

        //Free Server: {wt, idx} --- smallest {weight, index} first!
        PriorityQueue<int[]> freeServers = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );

        //Busy Server: {finTime, wt, idx} --- smallest {finish Time, weight, index} first!
        PriorityQueue<long[]> busyServers = new PriorityQueue<>(
            (a, b) -> {
                if(a[0] != b[0]) return Long.compare(a[0], b[0]);
                if(a[1] != b[1]) return Long.compare(a[1], b[1]);
                return Long.compare(a[2], b[2]);
            }
        );

        for(int i=0; i<n; i++){
            freeServers.add(new int[]{servers[i], i});
        }

        int[] ans = new int[m];
        for(int i=0; i<m; i++){
            //busy server ---> free server
            while(!busyServers.isEmpty() && busyServers.peek()[0] <= i){
                long[] curr = busyServers.poll();
                freeServers.add(new int[]{(int) curr[1], (int) curr[2]});
            }

            if(freeServers.isEmpty()){
                //nobody free: wait for earliest finishing Server
                long[] curr = busyServers.poll();
                ans[i] = (int)curr[2];
                busyServers.add(new long[]{curr[0] + tasks[i], curr[1], curr[2]});
            }else{
                //free server ---> busy server
                int[] curr = freeServers.poll();
                ans[i] = curr[1];
                busyServers.add(new long[]{ i + (long)tasks[i], curr[0], curr[1]}); 
            }
        }

        return ans;
    }
}