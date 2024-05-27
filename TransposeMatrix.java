public class TransposeMatrix {

    public static void main(String[] args) {
        
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] mat2= new int[3][3];

        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat2[j][i] = mat1[i][j];
            }
        }
        System.out.println("Transpose Of Matrix");
        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    
}
