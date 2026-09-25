class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        List<Character> ls = new ArrayList<>(map.keySet()); //store all unique values
        ls.sort((a, b) -> map.get(b) - map.get(a)); //sort acc. to frequency in desc. order

        StringBuilder sb = new StringBuilder();
        for(char ch:ls){
            int freq = map.get(ch);
            sb.append(String.valueOf(ch).repeat(freq));
        }
        return sb.toString();
    }
}