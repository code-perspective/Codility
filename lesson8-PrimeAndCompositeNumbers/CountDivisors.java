class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        
        int count=0;
        int i=1;
        while(i*i<N && i*i>0)
        {
            if(N%i==0)
                count=count+2;
            i++;
        }
        if(i*i==N )
            count++;
        return count;
    }
}