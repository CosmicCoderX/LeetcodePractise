class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = costs[0];
        for(int num: costs){
            if(num > maxCost){
                maxCost = num;
            }
        }

        int[] freq = new int[maxCost+1];
        for(int cost:costs){
            freq[cost]++;
        }

        int ans = 0;
        for(int cost = 1; cost<=maxCost; cost++){
            while(freq[cost] > 0){
                if(coins < cost){
                    return ans;
                }
                coins -= cost;
                ans++;
                freq[cost]--;
            }
        }
        return ans;
    }
}