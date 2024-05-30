public class SortArr {
    
    public static void sort(int[] arr)
    {
       int temp = 0;
       
       for(int i=0;i<arr.length-1;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
             temp = arr[j];
             arr[j]=arr[i];
             arr[i]=temp;
             
            }

        }
       }
       System.out.println("\nSorted Array :");
       for(int element : arr)
       {
        System.out.print(element+" ");
       }
    }

    public static void main(String[] args) {
        
        int[] arr = {5,2,1,8,6};
        
        System.out.println("Array :");
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
        
        sort(arr);
    }
}
