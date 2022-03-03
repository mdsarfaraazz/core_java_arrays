package array.pack;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {10,20,30,40,50};
         int sum=0;
         System.out.println("This are the original elements");
         for ( int i=0; i<arr.length;i++) {
        	 System.out.println(arr[i]+" ");
         }
         
         System.out.println("Sum of the array is...."+sum);
         for(int i=0; i<arr.length;i++) {
        	 sum=arr[i]+sum;
         }
         System.out.println(sum);
	}

}
