class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0;
        int maxLen = 0;
        int countZeros = 0;
        
        while (right < nums.length) {
            if (nums[right] == 0) {
                countZeros++;
            }
            
            
            while (countZeros > 1) {
                if (nums[left] == 0) {
                    countZeros--;
                }
                left++;
            }
            
            
            maxLen = Math.max(maxLen, right - left);
            
            right++;
        }
        
        
        return maxLen == nums.length ? maxLen - 1 : maxLen;
    }
}
