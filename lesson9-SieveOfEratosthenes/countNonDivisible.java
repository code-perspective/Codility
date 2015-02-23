// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A) {
    int[][] D = new int[A.length*2 + 1][2];

    for (int i = 0; i < A.length; i++) {
        D[A[i]][0]++;
        D[A[i]][1] = -1;
    }

    for (int i = 0; i < A.length; i++) {
        if (D[A[i]][1] == -1) {
            D[A[i]][1] = 0;
            for (int j = 1; j <= Math.sqrt(A[i]) ; j++) {
                if (A[i] % j == 0 && A[i] / j != j) {
                    D[A[i]][1] += D[j][0];
                    D[A[i]][1] += D[A[i]/j][0];
                } else if (A[i] % j == 0 && A[i] / j == j) {
                    D[A[i]][1] += D[j][0];
                }
            }
        }
    }
    for (int i = 0; i < A.length; i++) {
        A[i] = A.length - D[A[i]][1];
    }
    return A;
}
}