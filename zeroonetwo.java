public class zeroonetwo {
    
    public static void adjacent(int []arr)
    {
        int start =0;
        int end = arr.length-1;
        int index =0;

        while(index<=end)
        {
           if (arr[index]==0)
           {
            int temp=arr[index];
            arr[index]=arr[start];
            arr[start]=temp;
            start++;
            index++;
           }
           else if(arr[index]==2)
           {
            int temp=arr[end];
            arr[end]=arr[index];
            arr[index]=temp;
            end--;
           }
           else
           {
            index++;
           }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={0, 1, 2, 0, 1, 2};
        adjacent(arr);
    }
}
