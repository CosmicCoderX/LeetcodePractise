class Solution {
    public char processStr(String s, long k) {
        long[] length = new long[s.length()];
        long len = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                len++;
            }else if(ch == '*'){
                if(len>0){
                    len--;
                }
            }else if(ch == '#'){
                len = len * 2;
            }
            // else if(ch == '%') -> length unchanged
            length[i] = len;
        }

        if(k < 0 || k >= length[s.length()-1]){
            return '.';
        }

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            long currLen = length[i];
            
            if(ch >= 'a' && ch <= 'z'){
                long oldLen = currLen -1;
                if(k == oldLen){
                    return ch;
                }
            }else if(ch == '%'){
                k = currLen - 1 - k;
            }else if(ch == '*'){
                long oldLen = currLen + 1;
            }else if(ch == '#'){
                long oldLen = currLen/2;
                k = k % oldLen;
            }   
        }
        return '.';
    }
}