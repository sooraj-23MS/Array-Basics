public class BoundaryEle {

    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3,0},
                       {4,5,6,0},
                       {7,8,9,0},
                       {0,0,0,0}};
        int row = arr.length;
        int col = arr[0].length;
        int n=0;
        int m=row-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
               if(i==n)
               {
                System.out.print(arr[i][j]+" ");
               }
               if(i>n && i<m)
               {
                if(j==0||j==col-1){
                System.out.print(arr[i][j]+" ");
                }
                else
                {
                    System.out.print("  ");
                }
               }
               if(i==m)
               {  
                  System.out.print(arr[i][j]+" ");
               }
            }
            System.out.println(" ");
            
        }
        System.out.println("**********");
        
    }
}
