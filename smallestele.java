package Array;
// Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n.
// Find the smallest number that is missing from the array. 
public class smallestele {
    public static void main(String[] args) {
        int arr[]={0, 1, 2, 3, 4, 5, 6, 7, 10};
        int  m=11;
        int n=9;
        int count=0;


        for(int i=0;i<m;i++)
        {
            count=0;

            for(int j=i;j<n;j++)
            {
                if(arr[j]==i)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("smallest missing number :"+i);
                break;
            }
            
        }
    }
}
