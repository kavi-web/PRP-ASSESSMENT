package prp;

import java.util.Scanner;

public class Exercise16 {
	 public static void main(String[] args) {
			int num;
			int rem;
			int rev=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("\n Enter the number:");
			num = sc.nextInt();
			while(num > 0)
			{
				rem = num%10;
				rev = rev* 10 + rem;
				num = num/10;
			}
			System.out.format("\n Reverse is = %d\n", rev);
		}
	}
