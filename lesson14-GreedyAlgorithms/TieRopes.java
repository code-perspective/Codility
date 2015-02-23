// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int count =0;
        
        int curr_length=0;
        for(int i=0;i<A.length;i++)
        {
            if(curr_length+A[i] >=K)
            {
                count++;
                curr_length=0;
            }else
                curr_length=curr_length+A[i];
        }
        return count;
    }
}