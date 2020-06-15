package prp;
import java.util.Scanner;
public class Exercise15 {
	public static void main(String[] args)
	{
           Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter an integer number:");
	        int rows = sc.nextInt();
	        
	        int floydNumber=1;
	        
	        for(int i=1;i<=rows;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print("* ");
	                floydNumber++;
	            }
	            System.out.println();
	        }
	    }
	}