public class greatsubarr {
    
    // Given an array arr[] of integers and a number x, 
    // the task is to find the smallest subarray with a 
    // sum greater than the given value. 
    // arr[] = {1, 4, 45, 6, 0, 19}
    //  x  =  51
    // Output: 3
    public static void main(String[] args) {
        int arr[]={1, 10, 5, 2, 7};
        int x=9;
        int sum=0;
        int subsum=0;
        int smallsub=arr.length;
        String smallen ="";
        for(int i=0;i<arr.length;i++)
        {  
            for(int j=i;j<arr.length;j++)
            {
                sum=0;smallen="";
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                    smallen += k;
                }
                if(sum>x && smallen.length()<smallsub )
                {
                    smallsub=smallen.length();
                    subsum=sum;
                }
            }
        }
        System.out.println("The smallest sub array sum is :"+subsum);
        System.out.println("The size is :" +smallsub);

    }
}
