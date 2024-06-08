package Array;

// Given two integer arrays of the same size, “arr[]” and “index[]”, 
// reorder elements in “arr[]” according to the given index array.
public class arrindex {
    
    public static void main(String[] args) {
        
        int arr[]={50, 40, 70, 60, 90};
        int index[]={3,  0,  4,  1,  2};
        int farr[]=new int[arr.length];
        int f=0;
        int find[]=new int[index.length];
        int d=0;
        
        for(int i=0;i<arr.length;i++)
        {
                for(int j=0;j<index.length;j++)
                {
                    if(i==index[j])
                    {
                        farr[f++] = arr[j];
                        find[d++] = index[j];
                    }
                }
        }
          
        for(int i=0;i<arr.length;i++)
        {
            System.out.print (farr[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print (find[i]+" ");
        }
    }
}
