package prp;
import java.util.Scanner;

public class Exercise2 {
      public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner(System.in);		
			System.out.println("\n Please Enter any integer Value: ");
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("\n it is an even number");
			}
			else {
				System.out.println("\n it is an odd number");
			}
		}
	}