class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int[] seat: reservedSeats){
            int row = seat[0];
            int col = seat[1];

            if(!map.containsKey(row)){
                map.put(row, new HashSet<>());
            }

            map.get(row).add(col);
        }

        int ans = (n - map.size()) * 2;

        for(int row: map.keySet()){
            HashSet<Integer> set = map.get(row);
            boolean left = false;
            boolean middle = false;
            boolean right = false;

            if(!set.contains(2) && !set.contains(3) && !set.contains(4) && !set.contains(5)){
                left = true;
            }
            if(!set.contains(4) && !set.contains(5) && !set.contains(6) && !set.contains(7)){
                middle = true;
            }
            if(!set.contains(6) && !set.contains(7) && !set.contains(8) && !set.contains(9)){
                right = true;
            }

            if (left && right) {
                ans += 2;
            }
            else if (left || middle || right) {
                ans += 1;
            }
        }

        return ans;
    }
}