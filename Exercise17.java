package prp;
public class Exercise17 {
	    public static void main(String[] args) {
	    	int num = 110011 , reversedvalue = 0, remainder, originalvalue;
	    	int originalvalue1 = num;
            while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedvalue = reversedvalue * 10 + remainder;
	            num  /= 10;
	        }
            if (originalvalue1 == reversedvalue)
	            System.out.println(originalvalue1 + " is a palindrome.");
	        else
	            System.out.println(originalvalue1 + " is not a palindrome.");
	    }
	}