// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        
        int last_set_max = 0;
        
        int curr_max=0;
        
        int[] result = new int[N];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==N+1)
                last_set_max=curr_max;
            else
            {
                if(result[A[i]-1]<last_set_max)
                    result[A[i]-1]=last_set_max+1;
                else
                    result[A[i]-1]++;
                    
                if(result[A[i]-1]>curr_max)
                    curr_max=result[A[i]-1];
            }
            
            
        }
        
        for(int i=0;i<N;i++)
        {
            if(result[i]<last_set_max)
                result[i]=last_set_max;
        }
        
        return result;
    }
}