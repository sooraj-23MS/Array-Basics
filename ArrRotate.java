public class ArrRotate {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[arr.length];

        int d = 2;

        for(int i=d;i<arr.length;i++)
        {
            
            arr1[i-d]=arr[i];
            
        }
        int bal = d;
        for(int k=0;k<d;k++)
        {
            arr1[arr.length-bal]=arr[k];
            bal--;

        }

        System.out.println("*********");
        for(int j=0;j<arr1.length;j++)
        {
            System.out.println(arr1[j]);
        }

        
    }
    
}
