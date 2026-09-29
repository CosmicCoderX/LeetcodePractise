class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                st.push(sb.length());
            }else if(ch == ')'){
                int l = st.pop();
                reverse(sb, l, sb.length()-1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void reverse(StringBuilder sb, int l, int r){
        while(l<r){
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }
    }
}