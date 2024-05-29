public class NormalTrace {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int sum =0;               

        System.out.println("***** Normal *****");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
              sum+=arr[i][j]*arr[i][j];
              
            }
        }
        System.out.println(Math.sqrt(sum));

        System.out.println("***** Trace *****");
        int i=0;
        int j=0;
        int k=0;
        int tra =0;
        while(k<3)
        {
        tra += arr[i][j];
        i++;
        j++;
        k++;
        }
        System.out.println(tra);

    }
}
