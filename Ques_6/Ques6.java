package Task_4;
import java.util.Scanner;

public class Ques6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number : ");
		int input=sc.nextInt();
		System.out.println("The entered input number is : "+input);
		int fact=1;
		while(input>=1) {
			fact=fact*input;
			
			input--;
		}
		System.out.println("Factorial of given number is : "+ fact);
	}
}
