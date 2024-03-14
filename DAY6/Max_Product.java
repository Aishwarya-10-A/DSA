/*You are given a list of N integers List[], list contains both +ve and -ve integers.
Your task is to findout, the Highest Product possible,
Where the product is the product of all the elements of contiguous sublist sList[],
and sub list should contain atleast 1 integer.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer output, the highest product.

Sample Input-1:
---------------
4
2 3 -2 4

Sample Output-1:
----------------
6

Explanation:
------------
Product of contiguous sub list [2,3].


Sample Input-2:
---------------
3
-2 0 -3

Sample Output-2:
----------------
0

Explanation:
------------
Product of sub list [0], where [-2,-3] is not a contiguous sublist
*/package DAY6;

import java.util.*;

public class Max_Product {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(new Max_Product().maxProduct(arr));
    }
    
    
    public static int maxProduct(int[] arr)
    {
        if(arr==null || arr.length==0)
        {
            return 0;
        }
        int max_product=Integer.MIN_VALUE;
        int max=1;
        int min=1;
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                max=1;
                min=1;
                max_product=Math.max(max_product,0);
            }
            else
            {
                int temp=max;
                max=Math.max(arr[i],Math.max(arr[i]*max,arr[i]*min));
                min=Math.min(arr[i],Math.min(arr[i]*temp,arr[i]*min));
                max_product=Math.max(max_product,max);
            }
        }
        return max_product;
    }
    
}
