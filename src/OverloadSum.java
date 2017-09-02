//Assignment 4.1.6
import java.util.Scanner;


public class OverloadSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int firstNumber = scan.nextInt();
		System.out.println("Enter the  second number:");
		int secondNumber =scan.nextInt();
		System.out.println("Enter the  Third number:");
		int thirdNumber =scan.nextInt();
		Sum(firstNumber,secondNumber,thirdNumber);
		Sum(firstNumber,secondNumber);
		
	}
	   public static void Sum(int firstNumber,int secondNumber,int thirdNumber){
		   int sum = firstNumber +secondNumber +thirdNumber;
		   System.out.println("Sum :"+sum);
		   
	   }
	      public static void Sum(int firstNumber,int secondNumber){
	    	  int result = firstNumber * secondNumber;
	    	  System.out.println("Result :"+result);
	    	  
	      }

}
