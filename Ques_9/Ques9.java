package Task_4;
import java.util.Scanner;
public class Ques9 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date of year you born");
		int DOY=sc.nextInt();
		System.out.println("The DOY born is :: "+DOY);
		System.out.println("Enter the Current year");
		int CYear=sc.nextInt();
		System.out.println("The Current Year  is :: "+DOY);
		int age = CYear - DOY;
		if(age>=60) {
			System.out.println("The person is senior citizen - " + age );
		}else {
			System.out.println("The person is not a senior citizen - "+age);
		}
	}

}
