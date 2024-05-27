import java.net.Socket;

public class CopyElements {
    public static void main(String[] args) {
        
       int[][] mat1 ={{1,2,3},{4,5,6},{7,8,9}};
        int row = mat1.length;;
        int col = mat1[0].length;

        int[][] mat2 = new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                mat2[i][j]=mat1[i][j];
            }
        }
        System.out.println(" ");
        System.out.println("***** Matrix *****");
        System.out.println("Copied Matrix : ");

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println(" ");
        }

         System.out.println("Base Matrix : ");

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        System.out.println("***** Array *****");
        

        int[] arr1 = {0,1,2,3,4,5};
        int[] arr2 = new int[arr1.length];

        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }

        System.out.println("Copied Array :");

        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Base Array :");

        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }





    }
    
}
