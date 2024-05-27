public class MatrixEqual {
    public static void main(String[] args) {
        int[][] mat1 ={{2,4,6,8},
                       {1,3,5,7}};
        int[][] mat2 ={{2,4,6,8},
                       {1,3,5,7}};

        int count = 0;
        for(int i=0;i<2;i++)
         {
            for(int j=0;j<4;j++)
            {
            if(mat1[i][j]!=mat2[i][j])
            {
                count++;
            }
            }

         }
         
        if(count>1)
         {
            System.out.println("Two Matrix are not equal");
         }
        else
         {
            System.out.println(" Two Matrix are equal");
         }
         
         
    }
    
}
