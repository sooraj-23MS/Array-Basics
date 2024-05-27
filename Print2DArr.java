import java.util.Scanner;

public class Print2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2d array");
        System.out.println("Enter the no fo rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the no of columns : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter the values :");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
             int val = sc.nextInt();
             arr[i][j]=val;   
            }
        }

        System.out.println("Final matrix:");
        
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
   
