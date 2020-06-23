import java.util.*;
public class Arrays4
{
  public static void main(String[] args)
   { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size");
     int size=sc.nextInt();
     System.out.println("Enter the array Element"); 
     int[] arr=new int[size];
     for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
     
     for(int i=0;i<size;i++)
      {
        System.out.println(arr[i]+"->"+((char)(arr[i])));
      }
   }
}