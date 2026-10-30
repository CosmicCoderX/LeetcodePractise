class Solution {
    public String reverseWords(String s) {
        String[] temp = s.trim().split("\\s+");

        String res = "";
        for(int i= temp.length-1; i>=0; i--){
            res+=temp[i]+" ";
        }

        return res.trim();

    }
}