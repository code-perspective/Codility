class Solution {
    
    
    int[] OPT;
    
    public int solution(int[] A) {
        // write your code in Java SE 8
        OPT=new int[A.length];
        
        OPT[0]=A[0];
        OPT[1]=A[0]+A[1];
        
        for(int i=2;i<A.length;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=i-1;j>=i-6;j--)
            {
                if(j<0)
                    break;
                    
                int temp = OPT[j];
                if(temp>max)
                    max = temp;
                
            }
            OPT[i]=max+A[i];
           
        }
        
        
        return OPT[A.length-1];
            
    }
    
    
}