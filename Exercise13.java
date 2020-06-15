package prp;
public class Exercise13 {
 public static void main(String[] args) {
        int i,j,isPrime,n;
        for (i = 10; i <= 99; i++) {
            isPrime = 0;
            for (j = 2; j <= i / 2; j++) {
               if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }
         if (isPrime == 0)
                System.out.print(i + " ");
        }
 
    }
}
