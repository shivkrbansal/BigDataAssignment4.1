//Assignment4.1.8
import java.util.Scanner;


public class DescendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the size of an array : ");
		int size =scan.nextInt();
		int[]arr = new int[size];
		System.out.print("Enter the values :");
		for(int i=0;i<arr.length;i++){
			
			 arr[i] = scan.nextInt();
			 
			
			
		}
		
		DescendingSort(arr);
		
		System.out.print("After Sorting Array is : ");
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
			
		}
		

	}
	  public static void DescendingSort(int[]arr){
		  int temp;
		  for(int i=0;i<arr.length-1;i++){
			  for(int j=0;j<arr.length-1;j++){
				  if(arr[j]<arr[j+1]){
					  temp =arr[j];
					  arr[j] =arr[j+1];
					  arr[j+1]=temp;
				  }
			  }
		  }
		  
		  
		  
	  }

}
