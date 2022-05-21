class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int total=0;
        int left=0;
        int right =len-1;
        while(left<right){
            total = Math.max(total,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return total;
    }
}