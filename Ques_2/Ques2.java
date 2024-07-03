package Task_4;
import java.util.Scanner;

public class Ques2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number :: ");
		int input =sc.nextInt();
		System.out.println("Entered input number is :: " + input);
		
		if(input % 2 == 0) {
			System.out.println("Given input is Even number :: " + input);
		}
		else {
			System.out.println("Given number is not an even number :: " + input);
		}

	}	
}
	
