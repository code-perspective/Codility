// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack s = new Stack();
        int count=0;
        for(int i=0;i<H.length;i++)
        {
            if(s.isEmpty())
            {
                s.push(H[i]);
                continue;
            }
            int top = (int)s.peek();
            if(top<=H[i])
                s.push(H[i]);
                
            else
            {
                int prev=0;
                while(!s.isEmpty()){
                    
                    int curr = (int)s.peek();
                    if(curr<=H[i])
                        break;
                    
                    if(curr!=prev)
                        count++;
                    prev = curr;
                    s.pop();
                }
                s.push(H[i]);
            }
        }
        
        int prev=0;
        while(!s.isEmpty()){            
            int curr = (int)s.pop();            
            if(curr!=prev)
                count++;
            prev = curr;
        }
        return count;
    }
}