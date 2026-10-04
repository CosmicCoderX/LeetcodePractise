class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        int cnt = 0; // current depth tracker

        for (int i = 0; i < n; i++) {
            char ch = seq.charAt(i);

            if (ch == '(') {
                // Naya level open hua, pehle depth badhao
                cnt++;
                // Odd depth -> Group 1, Even depth -> Group 0
                ans[i] = cnt % 2;
            } else if (ch == ')') {
                // Same level close ho raha hai, pehle group assign karo
                ans[i] = cnt % 2;
                // Ab level khatam, depth ghatao
                cnt--;
            }
        }
        return ans;
    }
}