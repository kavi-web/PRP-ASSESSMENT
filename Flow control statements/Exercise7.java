package prp;
import java.util.Scanner;
public class Exercise7 {
	
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		String f=c.toLowerCase();
		if(c.equals(f))
		{
			System.out.println(f.toUpperCase());
		}
		else
		{
			System.out.println(f.toLowerCase());
		}
		}
	}

