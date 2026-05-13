class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> 
            Integer.compare((b[1]-b[0]), (a[1]-a[0]))
        );

        int ans = 0;
        int energy = 0;
        for(int i=0; i<tasks.length; i++){
            //task[i][0] -> actual
            //task[i][1] -> minimum
            if(energy < tasks[i][1]){
                int extra = tasks[i][1] - energy;
                ans+=extra;
                energy+=extra;
            }

            energy-= tasks[i][0];
        }

        return ans;
    }
}