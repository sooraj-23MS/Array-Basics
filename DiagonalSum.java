public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println("First diagonal");
        int i=0,j=0,k=0;
        int tra =0;
        while(k<3)
        {
        tra += arr[i][j];
        i++;
        j++;
        k++;
        }
        System.out.println(tra);
        System.out.println("second diagonal");

        int a=0,b=2,c=0;
        int sec=0; 

        while(c<3)
        {
            sec+=arr[a][b];
            a++;
            b--;
            c++;

        }
        System.out.println(sec);
    }
    
}
