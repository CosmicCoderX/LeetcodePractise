class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        Stack<Integer> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '('){
                st.push(score);
                score = 0;

            }else{
                if(score == 0){
                    score = 1;
                }else{
                    score = 2*score;
                }
                score = st.pop() + score;
            }
        }
        return score;
    }
}