// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static int count=0;
    public int solution(int[] A) {
        // write your code in Java SE 8
        count =0;
        CountSort(A);
        if(count>1000000000)
            return -1;
        return count;
    }
    
     public static int[] CountSort(int arr[]){
        if(arr.length<=1)
            return arr;
        
        int split= arr.length/2 -1;
        int[] a = subArray(arr, 0, split);
        int[] b = subArray(arr, split+1, arr.length-1);
        
        a=CountSort(a);
        b=CountSort(b);
        
        return merge(a, b);
    }
    
     public static int[] subArray(int arr[],int start,int end){
         int[] result = new int[end-start+1];
         for(int i=start;i<=end;i++){
             
             result[i-start]=arr[i];
         }
         return result;
     }
    
     public static int[] merge(int a[],int b[]){
         int[] c = new int[a.length+b.length];
         int i=a.length-1,j=b.length-1,k=a.length+b.length-1;
         while(i>=0&&j>=0){
             
             if(a[i]<=b[j])
             {
                 c[k]=b[j];
                 j--;
             }else{
                 count = count +j+1;
                 c[k]=a[i];
                 i--;
             }
             k--;
         }
         
         while(i>=0){
             c[k]=a[i];
             i--;
             k--;
         }
         
         while(j>=0){
             c[k]=b[j];
             j--;
             k--;
         }
         return c;
     }
}