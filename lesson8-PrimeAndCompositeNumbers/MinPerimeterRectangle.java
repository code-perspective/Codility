// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int a = (int)Math.sqrt(N);
        for(int i=a;i>1;i--)
        {
            if(N%i==0)
                return 2*(i+(N/i));
        }
        
        return 2*(1+N);
    }
}