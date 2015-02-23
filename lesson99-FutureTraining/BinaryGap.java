// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        
        int idx=1;
        int max=0;
        int curr=-1;
        while(idx<N && idx>0)
        {
            
            int temp =N&idx;
            if(temp!=0)
                curr=0;
            else
            {
                if(curr!=-1)
                    curr++;
            }
                
            if(curr>max)
                max=curr;
            idx=idx<<1;
        }
        
        return max;
    }
}