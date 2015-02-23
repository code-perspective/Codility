// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min_idx = 0;
        int max_profit=0;
        
        
        
        for(int i=1;i<A.length;i++)
        {
          if(A[i]<A[min_idx])
              min_idx=i;
          
          int curr_profit=A[i]-A[min_idx];
          if( curr_profit>max_profit)
              max_profit=curr_profit;
        }
        
        if(max_profit<=0)
            return 0;
        return max_profit;
    }
}
