package Array;
// Given an array arr[] of size N having distinct numbers sorted in increasing order and the array has been right rotated
//  (i.e, the last element will be cyclically shifted to the starting position of the array) k number of times, 
//  the task is to find the value of k.




import java.util.Arrays;

public class noofrotation {
    public static void main(String[] args) {
        int arr[]={7, 9, 11, 12, 5};
        int val=0;
        int index=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                 val = arr[i];
                 index = i+1;

            }
        }
        System.out.println("rotations : "+index);
    }
    
}
