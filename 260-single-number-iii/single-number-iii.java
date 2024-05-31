public class Solution {
    public int[] singleNumber(int[] nums)
    {
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }
        
        int bitmask = xorResult & -xorResult;
        
        int[] result = new int[2];
        for (int num : nums) {
            if ((num & bitmask) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        
        return result;
    }
}
