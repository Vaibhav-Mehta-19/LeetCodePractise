class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
            nums[i]=0;
        }
        int k=0;
        for(int i:hs)
        {
            nums[k]=i;
            k++;
        }
        return hs.size();
    }
}