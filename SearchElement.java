import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        
     int[] arr = {5,6,2,11,15,99};
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter value : ");
     int val = sc.nextInt();
     int count = 0;

     for(int i=0;i<arr.length;i++)
     {
        if(val==arr[i])
        { int pos = i+1;
         System.out.println("Value founded : "+arr[i]);
         System.out.println("In position :"+ pos );
        }
        if(val!=arr[i])
        {
            count++;
        }
     }
     if(count==arr.length)
     {
        System.out.println("Value not found");
     }
     
     System.out.println("Another Method :"); 

     for(int element : arr) // Another for loop
     {
        if(element==val)
        {
            System.out.println("Value found");
        }
     }

    }
}
