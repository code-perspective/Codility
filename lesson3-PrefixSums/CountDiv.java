// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int left = A/K;
        int right = B/K;
        int result = right-left;
        if(A%K==0)
            result++;
        return result;
    }
}