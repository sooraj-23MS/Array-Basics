public class Add2Matrix {
    public static void main(String[] args) {
        
        int[][] mat1 = {{1,2},{4,5}};
        int[][] mat2 = {{2,3},{5,6}};
        int row = mat1.length;
        int col = mat2[0].length;

        int[][] mat3 = new int[row][col];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                mat3[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println(" ");
        System.out.println("Added matrix:");
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
