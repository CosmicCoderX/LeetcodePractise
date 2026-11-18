class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        String numStr = String.valueOf(Math.abs((long) x));
        
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        
        try {
            int res = Integer.parseInt(reversedStr);
            return isNegative ? -res : res;
        } catch (NumberFormatException e) {
            return 0; // Overflow occurred
        }
    }
}