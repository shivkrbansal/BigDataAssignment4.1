//Assignment4.1.3

import java.util.Scanner;


public class acad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum,firstNumber,secondNumber;
		System.out.print("First Number is :");
		firstNumber =scan.nextInt();
		System.out.print("Second Number : ");
		secondNumber =scan.nextInt();
        sum =sum(firstNumber,secondNumber);
        System.out.println("Sum is : "+sum);

	}
	  public static int sum(int firstNumber,int secondNumber){
		  int sum;
		  sum = firstNumber +secondNumber;
		  
		  return sum;
		  
	  }

}
