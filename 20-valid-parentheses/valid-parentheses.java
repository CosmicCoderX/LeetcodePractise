class Solution {
    public boolean isValid(String s) {
        if(isBalanced(s)){
            return true;
        }else{
            return false;
        }
    }
    public boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(!isMatching(top, ch)) return false;
            }
        }
        return st.isEmpty();
    }
    
    public boolean isMatching(char l, char r){
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }
}