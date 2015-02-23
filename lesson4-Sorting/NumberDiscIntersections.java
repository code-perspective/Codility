// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int[] start = new int[A.length];
        int[] end = new int[A.length];
        
        for(int i=0;i<A.length;i++)
        {
            start[i]=(int)Math.max(0,(long)i - (long)A[i] );
            end[i]=(int)Math.min(A.length,(long)A[i] + (long)i);
        }
        
        int result = 0;
        Arrays.sort(start);
        Arrays.sort(end);
        
        int lowidx=0;
        for(int i = 0; i <A.length;i++)
        {
            while(lowidx<A.length && end[i]>=start[lowidx])
            {
                lowidx++;
            }
            
            result = result+lowidx-i-1;
            if(result >10000000)
                return -1;
        }
        
        return result;
    }
    
    
}