package Array;
// arr arrange
// Given an array of elements of length N, ranging from 0 to N – 1. 
// All elements may not be present in the array. If the element is not present then there will be -1 present in the array. 
// Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
public class arangearr {
    
    public static void main(String[] args) {
        int arr[] ={2,-1,6,1,9,3,-1,-1,4,-1};
        int arr2[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                 if(arr[j]==i)
                 {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                 }

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
