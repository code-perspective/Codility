// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int M, int[] A) {
        // write your code in Java SE 8
        
        int[] mem = new int[M+1];
        for(int i=0;i<mem.length;i++)
            mem[i]=-1;
        int start =0;
        int end = 1;
        long count=0;
        mem[A[0]]=0;
        while(start<end)
        {
            //System.out.println(start+","+end+","+count);
            while (end<A.length)
            {
                if(mem[A[end]]!=-1)
                    break;
                mem[A[end]]=end;
                end++;
            }
            
            if(end==A.length)
            {
                long temp = end-start;
                count = count + temp*(temp+1)/2;
                //
                break;
            }else{
                
                int new_start = mem[A[end]];
                
                for(int i=start;i<=new_start;i++)
                {
                    count = count + end-i;
                    mem[A[i]]=-1;
                }
               
                mem[A[end]] =end;
                start = new_start+1;
                end = end+1;
            }
            
             if(count>1000000000)
                return 1000000000;
            
        }
        
        if(count>1000000000)
            return 1000000000;
        else
            return (int)count;
            
      
    }
}