//Assignment 4.1.4
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the firt number:");
		int firstNumber = scan.nextInt();
		System.out.print("Enter the second number:");
		int secondNumber =scan.nextInt();
		OddEven(firstNumber,secondNumber);
		

	}
	  public static void OddEven(int firstNumber,int secondNumber){
		  for(int i=firstNumber;i<=secondNumber;i++){
			  if(i%2==0){
				  System.out.println("Even Number is"+i);
				  
			  }
			  else
				  System.out.println("Odd number is "+i);
			  
		  }
	  }

}
