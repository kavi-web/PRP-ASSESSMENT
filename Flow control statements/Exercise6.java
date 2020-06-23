package prp;
import java.util.Scanner;
public class Exercise6 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.next();
		int age=sc.nextInt();
		if(gender.equals("Female") && age>1 && age<58)
		{
			System.out.println("the percentage of interest is 8.2%.");	
		}
		if(gender.equals("Female") && age>58 && age<100)
		{
			System.out.println("the percentage of interest is 9.2%.");	
		}
		if(gender.equals("male") && age>1 && age<58)
		{
			System.out.println("the percentage of interest is 8.4%.");
		}
		if(gender.equals("male") && age>58 && age<100)
		{
			System.out.println("the percentage of interest is 10.5%.");	
		}
		}
	}