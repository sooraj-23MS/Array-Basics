public class MergeArr {

    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int index = arr1.length+arr2.length;
        int[] fnl = new int[index];
        int j=0;
        for(int i=0;i<arr1.length;i++)
        {
            fnl[j++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            fnl[j++]=arr2[i];
        }

        for(int i=0;i<index;i++)
        {
            System.out.print(fnl[i]+" ");
           
        }
        System.out.println("\n");
        System.out.println("*****************");
        System.out.println("Using arraycopy method :");

        int[] cop1={1,2,3,4};
        int[] cop2={5,6,7,8};
        int c1 = cop1.length;
        int c2 = cop2.length;
        int c3 = c1+c2;

        int[] fcopy= new int[c3];

        System.arraycopy(cop1,0 , fcopy, 0, c1);
        System.arraycopy(cop2, 0, fcopy, c1, c2);

        for(int i=0;i<c3;i++)
        {
            System.out.print(fcopy[i]+" ");
        }
    }
    
}
