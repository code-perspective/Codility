// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int N=S.length();
        int M=P.length;
        int[] A = new int[N];
        int[] C = new int[N];
        int[] G = new int[N];
        int[] T = new int[N];
        
        int[] result = new int[M];
        
       switch(S.charAt(0))
            {
                case 'A':
                    A[0]=1;
                    break;
                case 'C':
                    C[0]=1;
                    break;
                case 'G':
                    G[0]=1;
                    break;
                case 'T':
                    T[0]=1;
                    break;
            }
        
        for(int i=1;i<N;i++)
        {
            switch(S.charAt(i))
            {
                case 'A':
                    A[i]=A[i-1]+1;
                    C[i]=C[i-1];
                    G[i]=G[i-1];
                    T[i]=T[i-1];
                    break;
                case 'C':
                    C[i]=C[i-1]+1;
                    A[i]=A[i-1];
                    G[i]=G[i-1];
                    T[i]=T[i-1];
                    break;
                case 'G':
                    G[i]=G[i-1]+1;
                    C[i]=C[i-1];
                    A[i]=A[i-1];
                    T[i]=T[i-1];
                    break;
                case 'T':
                    T[i]=T[i-1]+1;
                    C[i]=C[i-1];
                    G[i]=G[i-1];
                    A[i]=A[i-1];
                    break;
            }
        }
        
        for(int i=0;i<M;i++)
        {
            if(exists(P[i],Q[i],A))
                result[i]=1;
            else  if(exists(P[i],Q[i],C))
                result[i]=2;
            else  if(exists(P[i],Q[i], G))
                result[i]=3;
            else  if(exists(P[i],Q[i],T))
                result[i]=4;
        }
        
        return result;
        
    }
    
    public boolean exists(int i,int j,int[] b)
    {
        if(b[j]-b[i]!=0)
            return true;
            
        if(i==0)
        {
            if(b[i]==1)
                return true;
            else
                return false;
        }else
        {
            if(b[i]==b[i-1])
                return false;
            else
                return true;
        }
    }
}