class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int maxLen = 0;
        int currentCost = 0;
        int start = 0;

        for (int i= 0;i< n;i++) {
            currentCost += Math.abs(s.charAt(i) - t.charAt(i));

            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}
