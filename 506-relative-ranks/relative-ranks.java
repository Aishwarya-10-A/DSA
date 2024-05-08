import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            scoreMap.put(score[i], i);
        }
        
        Arrays.sort(score);
        String[] result = new String[score.length];
        
        for (int i = score.length - 1, rank = 1; i >= 0; i--, rank++) {
            int index = scoreMap.get(score[i]);
            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }
        }
        
        return result;
    }
}
