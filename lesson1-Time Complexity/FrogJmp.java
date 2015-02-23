// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        
        int result = (Y-X)/D;
        
        
        if((Y-X)%D!=0)
            result++;
        return result;
    }
}