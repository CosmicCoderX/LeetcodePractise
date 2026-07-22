class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n =s.length();
        int activeCnt = 0;
        for(int k=0; k<n; k++){
            if(s.charAt(k) == '1'){
                activeCnt++;
            }
        }
        List<Integer> inactiveBlocks = new ArrayList<>();
        int i = 0;
        while(i<n){
            if(s.charAt(i) == '0'){
                int start = i;
                while(i<n && s.charAt(i) == '0') i++;
                inactiveBlocks.add(i-start);
            }else{
                i++;
            }
        }

        int maxPair = 0;
        for(int j=1; j<inactiveBlocks.size(); j++){
            int sum = inactiveBlocks.get(j) + inactiveBlocks.get(j-1);
            maxPair = Math.max(maxPair, sum);
        }

        return maxPair + activeCnt;
    }
}