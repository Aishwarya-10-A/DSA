class Solution
{
    public String[] findWords(String[] words)
    {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int count = 0;
        for (String word : words)
        {
            if (canTypeInOneRow(word.toLowerCase(), rows))
            {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (String word : words)
        {
            if (canTypeInOneRow(word.toLowerCase(), rows))
            {
                result[index++] = word;
            }
        }
        return result;
    }

    private boolean canTypeInOneRow(String word, String[] rows)
    {
        for (String row : rows)
        {
            boolean canTypeInRow = true;
            for (char c : word.toCharArray())
            {
                if (row.indexOf(c) == -1)
                {
                    canTypeInRow = false;
                    break;
                }
            }
            if (canTypeInRow)
            {
                return true;
            }
        }
        return false;
    }
}
