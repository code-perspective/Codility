// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        
        long n= N;
        long m = M;
        
        if(N==M+1)
            return N;
        
        long lcm = n*m/gcd(N,M);
        
        return  (int) (lcm/M);
        
        
    }
    
    public int gcd(int a, int b){
        if(a<b)
        {
            int temp = a;
            a=b;
            b=temp;
        }
        if(a%b==0)
            return b;
        else
            return gcd(b,a%b);
            
    }
}