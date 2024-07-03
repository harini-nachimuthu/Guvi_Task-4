package Task_4;
import java.util.Scanner;

public class Ques10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer :: ");
		int a=sc.nextInt();
		System.out.println("The integer entered is :: " + a );
		int count=0;
		while(a!=0) {                 
			count=count+1;
			//a=a%10;        
			a=a/10;
			
		}
		System.out.println("Count value :: " + count);
	}

}
