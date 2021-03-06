// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        
        int count = Math.min(1,A.length);
        
        for(int i=1;i<A.length;i++)
        {
            if(A[i]!=A[i-1])
                count++;
        }
        return count;
    }
}