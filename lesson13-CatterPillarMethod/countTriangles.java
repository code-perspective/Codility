// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count = 0;
        for(int i=0;i<A.length-2;i++)
        {
            int k=i+2;;
            for(int j=i+1;j<A.length-1;j++)
            {
                int sum = A[i]+A[j];
                if(k<=j)
                    k=j+1;
                else
                    count = count + k-j-1;
                while(k<A.length)
                {
                    if(A[k] < sum)
                        count++;
                    else
                        break;
                    k++;
                }
            }
        }
        return count;
    }
}