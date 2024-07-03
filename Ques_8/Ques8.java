package Task_4;
import java.util.Scanner;

public class Ques8 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name="Welcome to Guvi";
		System.out.println("Enter the n times to run ");
		int n=sc.nextInt();
		System.out.println("The given string has to be entered "+ n + "times . ");
		int i=1;
		while (i<=n) {
			System.out.println(name + " - " + i);
			i++;
		}
		
	}

}
