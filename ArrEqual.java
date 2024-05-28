public class ArrEqual {

    public static void main(String[] args) {
        
        int[] arr ={1,2,3,4,2,1};
        int[] arr2 = {1,2,3,4,2,1};
        int count =0;

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]!=arr2[i])
            {
              count++;
            }
        }
        if(count>1)
        {
          System.out.println("Array not equal");
        }
        else 
        {
           System.out.println("Array equal");
        }

        
        int rep =0;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    rep++;
                }
            }
        }
        System.out.println("no of repeated elements in arr 1:");
        System.out.println(rep);

        System.out.println("*******************");

        int a=0;
        int b=0;
        int rept =0;

        System.out.println("no of repeated elements in arr 2:");
        System.out.println(rept);

        

    }
    
}
