class Solution
{
    public int findPoisonedDuration(int[] timeSeries, int duration)
    {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }

        int totalDuration = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            totalDuration += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        totalDuration += duration;
        return totalDuration;

        
    }
}