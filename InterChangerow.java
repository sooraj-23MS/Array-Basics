public class InterChangerow {

    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int row = arr.length;
        int col = arr[0].length;
        int[][] arr2 = new int[row][col]; 
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0)
                {
                    arr2[row-1][j]=arr[i][j];
                }
                if(i!=0 && i<row-1)
                {
                    arr2[i][j]=arr[i][j]; 
                }
                if(i==row-1)
                {
                    arr2[0][j]=arr[i][j];
                }
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Another method :");
        int[][] mat = {{7,8,9},
                       {4,5,6},
                       {1,2,3} };

        int temp = 0 ;
        for(int j =0;j<col;j++)
        {
            temp=mat[0][j];
            mat[0][j]=mat[row-1][j];
            mat[row-1][j]=temp;
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
