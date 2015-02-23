// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        A=HeapSort(A);
        int min = 2*Math.abs(A[0]);
        for(int i=1;i<A.length;i++)
        {
            int a =A[i]/ Math.abs(A[i]);
            int b =A[i-1]/ Math.abs(A[i-1]);
            if(Math.abs(A[i]+A[i-1])<min && a*b<0)
                min = Math.abs(A[i]+A[i-1]);
        }
        return min;
    }
    
       public  int max(int a , int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    
    public  int[] HeapSort(int arr[]){
        
        constructHeap(arr, arr.length-1);
       
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            adjustHeap(arr,0,i-1);
        }
        return arr;
    }
    
    public  void constructHeap(int arr[],int end){
        
        for(int i=(end-1)/2;i>=0;i--){
            adjustHeap(arr,i,end);
        }
    }
    
    public  void adjustHeap(int arr[],int root,int end){
        int child=root*2+1;
        int temp=arr[root];
        
        while(child<=end){
            
            if(child<end && isLess(arr[child],arr[child+1]) )
                child++;
                
                
            if(isLess(arr[child] , temp))
                break;
            else{
                arr[(child-1)/2]=arr[child];
                child=child*2+1;
            }
        }
        arr[(child-1)/2]=temp;
        
    }
    
    public boolean isLess(int a, int b)
    {
        a=Math.abs(a);
        b=Math.abs(b);
        if(a<b)
            return true;
        else
            return false;
    }
}