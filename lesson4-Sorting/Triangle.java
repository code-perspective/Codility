// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        
        if(A.length<3)
            return 0;
        
        for(int i=1;i<A.length-1;i++)
        {
            long sum =(long)A[i]+(long)A[i-1];
            if(sum>A[i+1])
                return 1;
           
        }
        return 0;
    }
}