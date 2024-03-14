/*A string is good if there are no repeated characters.

Given a string s, return the number of good substrings of length three in s.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.

input =xyzzaz
output =1
Explanation: 
There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

input =aababcabc
output = 4
Explanation: 
There are 7 substrings of size 3: 
"aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
 */

package DAY6;

import java.util.Scanner;

 class Count {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(new Count().countSubstrings(s));
    }
    public static int countSubstrings(String s)
    {
        int count=0;
        for(int i=0;i<=s.length()-3;i++)
        {
            if(isGood(s.substring(i,i+3)))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean isGood(String x)
    {
        return x.charAt(0)!=x.charAt(1) && x.charAt(1)!=x.charAt(2) && x.charAt(0)!=x.charAt(2);
    }
    
}
