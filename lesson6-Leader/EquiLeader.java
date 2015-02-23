// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int dom_idx = dominator(A);
        if(dom_idx==-1)
            return 0;
        
        int dom = A[dom_idx];
        int count=0;
        for(int i=0;i<A.length;i++)
            if(A[i]==dom)
                count++;
        
        int result = 0;
        int left=0;
        int right = count;
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i]==dom)
            {
                left++;
                right--;
            }
            
            if(left > (i+1)/2 && right > (A.length-i-1)/2)
                result++;
        }
        return result;
    }
    
    public int dominator(int[] A) {
        // write your code in Java SE 8
        
        int count =0;
        int idx=0;
        
        for(int i=0;i<A.length;i++){
            if(count==0)
                idx=i;
            {
                if(A[i]==A[idx])
                    count++;
                else
                    count--;
            }
        }
        
        if(count<=0)
            return -1;
            
        count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[idx]==A[i])
                count++;
        }
        if(count>A.length/2)
            return idx;
        else
            return -1;
    }
}