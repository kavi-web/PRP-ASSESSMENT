import java.util.*;
 public class Arrays3
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int size=sc.nextInt();
    int[] arr=new int[size];
   System.out.println("Enter the array element");
    for(int i=0;i<arr.length;i++)
     {
       arr[i]=sc.nextInt();
     }
   System.out.println("Enter the search element");
   int search=sc.nextInt();
   int index=0;
   boolean check=false; 
   for(int i=0;i<arr.length;i++)
   {
    if(arr[i]==search)
     {
       check=true;
       index=i;
       break;
      }
   }
   if(check==true)
   System.out.println("Index of the given number in the array="+index);
   else
   System.out.println("-1");


  
}
}

