// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        BitSet b = new BitSet(A.length);
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0&& A[i]<=A.length)
                b.set(A[i]);
        }
        
        for(int i=1;i<=A.length;i++)
        {
            if(!b.get(i))
                return i;
        }
        return A.length+1;
    }
}