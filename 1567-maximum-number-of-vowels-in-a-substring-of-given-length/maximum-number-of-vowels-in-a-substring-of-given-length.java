class Solution {
    public int maxVowels(String s, int k) {
           int n=s.length();
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        String v="aeiou";
        for(int i=0;i<k;i++)
        {
            if(v.indexOf(Character.toLowerCase(s.charAt(i)))!=-1)
            {
                count++;
            }
        }
        maxCount=count;
        for(int i=k;i<n;i++)
        {
            if(v.indexOf(Character.toLowerCase(s.charAt(i-k)))!=-1)
            {
                count--;
            }
            if(v.indexOf(Character.toLowerCase(s.charAt(i)))!=-1)
            {
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    
    }
}