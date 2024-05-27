public class LargestElement {
    public static void main(String[] args) {
        
        int[] arr = {5,6,4,8,9};

         
           int i = arr[0];
           for (int j = 1 ;j<arr.length;j++)
           {
            if(i<arr[j])
            {  
              i = arr[j];
            }
            
           }
            System.out.println("***** Array *****");
           for (int k = 0 ;k<arr.length;k++)
           {
            System.out.print(arr[k]+" ");
           }
           System.out.println(" ");
           System.out.println("Largest Element : ");
           System.out.println(i);
            
    }  
}
