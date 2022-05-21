class Solution {
    public int trap(int[] height) {
        int total=0;
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = height[0];
        right[len-1] = height[len-1];
        for(int i=1;i<len;i++)
        {
            if(height[i]>left[i-1])
            {
                left[i] = height[i];
            }
            else
            {
                left[i] = left[i-1];
            }
        }
        for(int i=len-2;i>=0;i--)
        {
            if(height[i]>right[i+1])
            {
                right[i] = height[i];
            }
            else
            {
                right[i] = right[i+1];
            }
        }
        for(int i=0;i<len;i++)
        {
            total+=Math.min(right[i],left[i])-height[i];
        }
        return total;
    }
}