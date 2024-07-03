package Task_4;
import java.util.Scanner;

public class Ques1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b,c,d ");
		int a =sc.nextInt();
		System.out.println("Enter the value of a : " + a);
		int b =sc.nextInt();
		System.out.println("Enter the value of b : " + b);
		int c =sc.nextInt();
		System.out.println("Enter the value of c : " + c);
		int d =sc.nextInt();
		System.out.println("Enter the value of d : " + d);
		int sum1 = a+b;
		int sum2 = c+d;
		
		if (sum1 > sum2 ) {
			System.out.println("a+b is greater than c+d : " + sum1);
		}
		else {
			System.out.println("c+d is greater than a+b : " + sum2);
		}
		
	}
}
