package array.pack;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {1,2,4,3,5};
          int Max = arr[0];
          int Min = arr[0];
          
          for( int i=0; i<arr.length;i++) {
        	  
        	  if(arr[i]>Max) {
        		  Max=arr[i];
        	  }
        	  
        	  if (arr[i]<Min) {
        		  Min=arr[i];
        	  }
        	  
          }
          
          System.out.println("max value is..."+Max);
          System.out.println("max value is..."+Min);
	}

}
