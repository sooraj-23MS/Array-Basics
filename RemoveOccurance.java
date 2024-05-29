public class RemoveOccurance {

    public static void main(String[] args) {
        
        int arr[]={1,2,1,3,1,4,1,5,1,6,1};
        int temp[]=new int[arr.length];
        int val = 1;
        int v=0;

        for(int j=0;j<arr.length;j++)
        {
            if(val!=arr[j])
            {
             temp[v++]=arr[j]; 
            }
        }

         // modify the array

        for(int i=0;i<temp.length;i++)
        {
            arr[i]=temp[i];
        }

        //print until v (no fo elements without occurance)

        for(int i=0;i<v;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
