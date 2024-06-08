package Array;
// Consider an array A[] of integers and following two types of queries. 
// update(l, r, x) : Adds x to all values from A[l] to A[r] (both inclusive).
// printArray() : Prints the current modified array.
public class modification
 {
    
    public static void update(int[] arr,int l,int r ,int v)
    {
        int left = l;
        int ryt = r;
        int val = v;
    
        for(int i=left;i<=ryt;i++)
        {
            arr[i]=arr[i]+v;
        }
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        
        int arr[]={10,5,20,40};
        update(arr, 0, 01, 10);
        printarr(arr);
        update(arr, 1, 03, 20);
        update(arr, 2, 02, 30);
        printarr(arr);
    }
}
