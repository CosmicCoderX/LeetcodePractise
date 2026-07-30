class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int push = 0;

        if(n > 0) push += Math.min(n, 8) * 1;
        if(n > 8) push += Math.min(n-8, 8) * 2;
        if(n > 16) push += Math.min(n-16, 8) * 3;
        if(n > 24) push += (n-24) * 4;

        return push;
    }
}