package prp;
import java.util.Scanner;
public class Exercise14 {
	public static void main(String arg[])	
		{
		    int num,sum;
	        Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the number ");
	        num=sc.nextInt();
		    for(sum=0 ;num!=0 ;num/=10)
		    {
			sum+=num%10;
		    }
		    System.out.println("Sum of all the digits of a given number is"+sum);               	  
		}
	}

