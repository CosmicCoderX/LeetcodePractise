class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve("", n, res);
        return res;
    }

    public boolean isValid(String s){
        int cnt = 0;
        for(char ch:s.toCharArray()){
            if(ch == '(') cnt++;
            else cnt--;

            if(cnt < 0) return false;
        }
        return cnt == 0;
    }

    public void solve(String temp, int n, List<String> res){
        if(temp.length() == 2*n){
            if(isValid(temp)){
                res.add(temp);
            }
            return;
        }

        solve(temp+"(", n, res);
        solve(temp+")", n, res);
    }
}