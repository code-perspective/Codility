// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int max=A[0];
        int max_sum=0;
        int curr_sum=0;
        
        for(int i=0;i<A.length;i++)
        {
            if(curr_sum+A[i] > 0)
                curr_sum=curr_sum+A[i];
            else
                curr_sum=0;
            
            if(curr_sum>max_sum)
                max_sum=curr_sum;
                
            if(A[i]>max)
                max=A[i];
        }
        
        if(max<=0)
            return max;
        else
            return max_sum;
    }
}