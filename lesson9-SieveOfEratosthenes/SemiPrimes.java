// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        
        int[] result = new int[P.length];
        
        int[] F = prepForFactor(N);
        
        int[] counts = new int[N+1];
        for(int i=1;i<=N;i++)
            counts[i]=counts[i-1]+ (isSemiPrime(i,F)?1:0);
            
        for(int i=0;i<P.length;i++)
        {
            int right = counts[Q[i]];
            int left = counts[P[i]];
            if(counts[P[i]]==counts[P[i]-1])
                result[i]=right-left;
            else
                result[i]=right-left+1;
        }
        return result;
    }
    
    public static boolean isSemiPrime(int a, int[] F)
    {
        if(F[a]==0)
            return false;
        else if(F[a/F[a]]==0)
            return true;
        else
            return false;        
    }
    
    public static int[] prepForFactor(int N)
    {
        int[] result = new int[N+1];
        for(int i=0;i<N+1;i++)
            result[i]=0;
        
        int i=2;
        while (i*i <= N)
        {
            if(result[i]==0){
                int k=i*i;
                while(k<=N)
                {
                    if(result[k]==0)
                        result[k]=i;
                    k=k+i;
                }
            }
            i=i+1;
        }
        return result;
    }
}
