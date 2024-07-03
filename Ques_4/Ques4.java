package Task_4;
import java.util.Scanner;

public class Ques4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a and b :: ");
		int a=sc.nextInt();
		System.out.println("The value of a is :: " + a);
		int b=sc.nextInt();
		System.out.println("The value of b is :: " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap the value of a is : " + a);
		System.out.println("After swap the value of a is : " + b);
		
		
	}

}
