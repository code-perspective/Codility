// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    
    int[] mem ;
    public int solution(int[] A) {
        // write your code in Java SE 8
        ArrayList<Integer> fib = getFib(A.length+1);
        mem = new int[A.length];
        for(int i=A.length-1;i>0;i--)
            numSteps(A,i,fib);
            
        return numSteps(A,-1,fib);
    }
    
    public int numSteps(int[] A, int pos,ArrayList<Integer> fib)
    {
        
        int N=A.length;
        if(pos>-1 && mem[pos]!=0)
            return mem[pos]; 
           
        int min = Integer.MAX_VALUE;
        
        
        for(int i=2;i<fib.size();i++)
        {
            if(pos+fib.get(i)==N)
            {
                min=1;
                break;
            }else if(pos+fib.get(i)>N)
                break;
            else
            {
                if(A[pos+fib.get(i)]==1)
                {
                    int steps = numSteps(A,pos+fib.get(i),fib);
                    if(steps!=-1)
                    {
                        steps++;
                        if(steps<min)
                            min=steps;
                    }
                }
            }
            
        }
        
       
        
        if(min==Integer.MAX_VALUE)
            min=-1;
        if(pos>-1)
            mem[pos]=min;
        
        return min;
    }
    
    public ArrayList<Integer> getFib(int N)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int a  = 0;
        int b = 1;
        int c = a+b;
        
        result.add(a);
        result.add(b);
        
        while(c<=N)
        {
            result.add(c);
            a=b;
            b=c;
            c=a+b;
        }
        
        return result;
    }
}