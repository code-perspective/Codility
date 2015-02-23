// you can also use imports, for example:
 import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        BitSet b = new BitSet(A.length);
        
        for(int i=0;i<A.length;i++)
            b.set(Math.abs(A[i]));
            
        return b.cardinality();
    }
}