class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] originalNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                int index1 = -1;
                int index2 = -1;
                for (int i = 0; i < originalNums.length; i++) {
                    if (originalNums[i] == nums[left] && index1 == -1) {
                        index1 = i;
                    } else if (originalNums[i] == nums[right]) {
                        index2 = i;
                    }
                }
                return new int[]{index1, index2};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[0];
    
    }
}