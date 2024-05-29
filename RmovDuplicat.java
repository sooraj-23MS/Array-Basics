public class RmovDuplicat {

    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,3,4,5};
        
        int n = arr.length;
        int temp[]=new int[n];

        int j=0;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }

        temp[j++]=arr[n-1];

        //modify

       for(int i=0;i<arr.length;i++)
       {
        arr[i]=temp[i];
       }

       // print modified array

       for(int k=0;k<j;k++)
       {
        System.out.print(arr[k]+" ");
       }
    }
    
}
