import java.util.*;
public class Arrays11
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size");
   int size=sc.nextInt();
   int[] arr=new int[size];
   System.out.println("Enter the array element");
   for(int i=0;i<size;i++)
   {
    arr[i]=sc.nextInt();
   }
 boolean check=false;
 for(int i=0;i<size;i++)
   {
    if(arr[i]==1||arr[i]==4)
     {
      check=true;
     }
     else
     {
      check=false;
      break;
     }
   }
 if(check==true)
  System.out.println("true");
 else
  System.out.println("false");
}
}