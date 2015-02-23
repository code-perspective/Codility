// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        
        if(A.length==0)
            return 0;
        int count =1;
        
        int end = B[0];
        for(int i =1;i<A.length;i++)
        {
            if(A[i]>end)
            {
                end=B[i];
                count++;
            }
        }
        return count;
    }
}