// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum=0;
        for(int i=0;i<A.length;i++)
            sum=sum+A[i];
            
        int result =0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==0)
            {
                result = result + sum;
                if(result>1000000000)
                    return -1;
            }else
                sum=sum-1;
                
        }
        return result;
    }
}