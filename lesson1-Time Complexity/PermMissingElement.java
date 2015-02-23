// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        long sum = 0;
        for(int i=0;i<A.length;i++)
            sum=sum+(long)A[i];
            
        long exp = (long)(A.length+1)* (long)(A.length+2)/2;
        return (int)(exp-sum);
    }
}