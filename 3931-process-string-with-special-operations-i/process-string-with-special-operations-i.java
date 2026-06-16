class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(res.length() > 0){
                    res = res.deleteCharAt(res.length()-1);
                }else{
                    res.append("");
                }
            }else if(ch == '#'){
                res.append(res);
            }else if(ch == '%'){
                res = res.reverse();
            }else{
                res.append(ch);
            }
            
        }
        return res.toString();
    }
}