// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        double min_avg = ((double)A[0]+A[1])/2;
        int idx=0;
        
        for(int i=2;i<A.length;i++)
        {
            double avg2=((double)A[i]+A[i-1])/2;
            if(avg2<min_avg)
            {
                min_avg=avg2;
                idx=i-1;
            }
            double avg3=((double)A[i]+A[i-1]+A[i-2])/3;
            
            if(avg3<min_avg)
            {
                min_avg=avg3;
                idx=i-2;
            }
        }
        
        return idx;
    }
}