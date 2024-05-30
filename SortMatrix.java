import java.util.Scanner;

public class SortMatrix {

    public static void main(String[] args) {
        int[][] mat = {{4,5,11,9},
                        {2,4,3,12},
                         {1,6,18,10},
                          {0,9,1,25}};
                        
        int row = mat.length;
        int col = mat[0].length;
        Scanner sc = new Scanner(System.in);
        int temp =0;
        System.out.println("Given Matrix :");
        for(int k=0;k<row;k++)
        {
            for(int l=0;l<col;l++)
            {
                System.out.print(mat[k][l]+ " ");
            }
            System.out.println();
        }
        System.out.println("Enter column :"); // sort using given column number
        int cnum = sc.nextInt()-1;
        System.out.println("Sorted Matrix :");
        for(int i=0;i<row-1;i++)
        {
            for(int j=i+1;j<row;j++)
            {
               if(mat[i][cnum]>mat[j][cnum])
               {
                for(int k=0;k<col;k++)
                {
                  temp =  mat[j][k];
                  mat[j][k]=mat[i][k];
                  mat[i][k]=temp;
                }
               }
            }
        }
        for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
          {
            System.out.print(mat[i][j]+" ");
          }
          System.out.println(" ");
        }
    }
    
}
