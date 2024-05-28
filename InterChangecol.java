public class InterChangecol {
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        int col = arr[0].length;
        int row = arr.length;
        int temp =0;

        for(int i=0;i<col;i++)
        {
            temp = arr[i][0];
            arr[i][0]= arr[i][col-1];
            arr[i][col-1]=temp;
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    
}
