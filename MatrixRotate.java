public class MatrixRotate {

    public static void main(String[] args) {
        int[][] arr = {{0,1,2},
                       {3,4,5},
                       {6,7,8}};

        int[][] ar = new int[3][3];

        int row = arr.length;
        int col = arr[0].length;

        //top row

        int trw=0;
        for(int i =0;i<col;i++)
        { 
            if(i<col-1)
            ar[trw][i+1]=arr[trw][i];
        }
        System.out.println(" ");

        // right column

        int rcl = col-1;
        for(int j=0;j<row;j++)
        {  
            if(j<row-1) //  row = 2 -- 3-1
            ar[j+1][rcl]=arr[j][rcl];
        }

        //bottom row

        int brw=row-1;
        for(int k=col-1;k>=0;k--)
        {
            if(k>0)
            ar[brw][k-1]=arr[brw][k];
        }
        
        //left column

        int lcl=0;
        for(int l=row-1;l>=0;l--)
        {
            if(l>0)
            ar[l-1][lcl]=arr[l][lcl];
        }
        

        // print matrix
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {   
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
