// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        
        BitSet b = new BitSet(X);
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0 && A[i]<=X)
            {
                if(!b.get(A[i]))
                {
                    count++;
                    b.set(A[i]);
                }
                
                if(count==X)
                    return i;
            }
        }
        
        return -1;
    }
}