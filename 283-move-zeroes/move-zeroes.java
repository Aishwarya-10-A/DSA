class Solution {
    public void moveZeroes(int[] nums) 
    {
        if(nums==null || nums.length==0)
        {
            return;
        }
        int left=0;
        int right=0;
        while(right<nums.length)
        {
            if(nums[right]!=0)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
            right++;
        }

        
    }
}