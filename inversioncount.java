public class inversioncount {

//   Inversion Count for an array indicates – how far (or close) the array is from being sorted. 
// If the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the inversion count is the maximum. 
// Given an array arr[]. The task is to find the inversion count of arr[].
// Where two elements arr[i] and arr[j] form an inversion if a[i] > a[j] and i < j.
      public static void main(String[] args) {
        
    
  int arr[]=  {8, 4, 2, 1};
  int count=0;
  for(int i=0;i<arr.length;i++)
  {
   for(int j=i;j<arr.length;j++)
   {
     if(arr[i]>arr[j])
     {
        System.out.println(arr[i]+" "+arr[j]);
        count++;
     }
    }
  }
  System.out.println("no of inversion : "+count);
}
}
