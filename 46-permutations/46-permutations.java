class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0)
        {
            return new ArrayList<>();
        }
        List<List<Integer>> finalans= new ArrayList<>();
        helper(nums, finalans, new ArrayList<>(),new boolean[nums.length]);
        return finalans;
    }
    public void helper(int[] nums, List<List<Integer>> finalans, List<Integer> curr, boolean[] used)
    {
        if(curr.size() == nums.length)
        {
            finalans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            curr.add(nums[i]);
            used[i] = true;
            helper(nums,finalans,curr,used);
            used[i] = false;
            curr.remove(curr.size()-1);
        }
    }
}