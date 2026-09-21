class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 1;
        int maxArea = -1;
        int l =0, r=n-1;
        while(l<r){
            area = (r-l) * Math.min(height[l], height[r]);
            if(area > maxArea){
                maxArea = area;
            }

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}