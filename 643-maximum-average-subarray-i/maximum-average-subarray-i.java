class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int n=nums.length;
        double max_average=Integer.MIN_VALUE;
        double sum=0;
        if(n<k || k<0)
        {
            return 0 ;
        }
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];

        }
        max_average=Math.max(max_average,sum/k);
        for(int i=k;i<n;i++)
        {
            sum+=nums[i]-nums[i-k];
            max_average=Math.max(max_average,sum/k);
        }
        return max_average;
        
    }
}