// you can also use imports, for example:
// import java.util.*;
import java.util.Stack;
// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack s = new Stack();
        
        for(int i=0;i<A.length;i++)
        {
            if(s.isEmpty()){
                s.push(i);
            }
            else{
                int top = (int)s.peek();
                if(B[top]==0 && B[i]==1)
                    s.push(i);
                    
                else if(B[top]==1 && B[i]==0){
                  
                    while(!s.empty() && B[(int)s.peek()] ==1 && A[(int)s.peek()] < A[i])
                        s.pop();
                        
                    if( (!s.isEmpty() && B[(int)s.peek()]==0) || (s.isEmpty()))
                        s.push(i);
                }
                else
                    s.push(i);
                    
            
            }

            
        }
        return s.size();
    }
}