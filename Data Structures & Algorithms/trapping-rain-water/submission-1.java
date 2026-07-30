class Solution {
    public int trap(int[] height) {
        if(height == null ||height.length ==0) {
            return 0;
        } 
        int l = 0,r = height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int result =0;
        while(l<r) {
            if(height[l]<height[r]) {
                l++;
                leftMax = Math.max(leftMax,height[l]);
                result += leftMax-height[l];
            }else {
                r--;
                rightMax = Math.max(rightMax,height[r]);
                result += rightMax-height[r];

            }
        }
        return result;
        
    }
}
