package Array;

public class printsubarray {
     
    public static void main(String[] args) {
        
        int val=5;
        for(int i=1;i<val;i++)
        {
            for(int j=i;j<val;j++)
            {
               for(int k=i;k<=j;k++)
               {
                System.out.print(k+" ");
                
               }
               System.out.println();
            }
        }


    }
}
