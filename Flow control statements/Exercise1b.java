package prp;

import java.util.Scanner;

public class Exercise1b {
	public static boolean lastDigit(int a, int b)
	{
		int x=a%10;
		int y=b%10;
		if(x==y)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
		System.out.println(lastDigit(a,b));
	}
}
