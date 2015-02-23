// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int sum = 0;
        
        for(int i=0;i<A.length;i++)
            sum=sum+A[i];
            
        int left = A[0];
        int right = sum-A[0];
        int min = Math.abs(right-left);
        for(int i=1;i<A.length-1;i++)
        {
            left = left+A[i];
            right = right-A[i];
            int diff = Math.abs(right-left);
            if(diff<min)
                min = diff;
        }
        
        return min;
    }
}