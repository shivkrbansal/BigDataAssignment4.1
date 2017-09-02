//Assignment 4.1.5
import java.util.Scanner;


public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input:");
		int Number = scan.nextInt();
		Multiplication(Number);

	}
	public static void Multiplication(int number){
		for(int i=1;i<=10;i++){
			System.out.println(number+"*"+i+"="+number*i);
		}
		
	}

}
