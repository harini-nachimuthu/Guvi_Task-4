package Task_4;
import java.util.Scanner;
public class Ques5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number :: ");
		int num=sc.nextInt();
		System.out.println("The value of input is  :: " + num);
		int i=2;
		boolean num1 = true;
		while(i<num) {
			if(num%i == 0) {
				System.out.println("Not a prime number : " + num);
				num1 = false;
				break;
			}
			i=i+1;
		}
		if (num1) {
			System.out.println("Is a prime number :: "+ num);
		}
		
	}

}
