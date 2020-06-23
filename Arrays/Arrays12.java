import java.util.*;
public class Arrays12
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the array element1:");
  int[] n1=new int[3];
  for(int i=0;i<3;i++)
   {
     n1[i]=sc.nextInt();
   }
  System.out.println("Enter the array element2:");
  int[] n2=new int[3];
  for(int i=0;i<3;i++)
   {
     n2[i]=sc.nextInt();
   }
 int[] ans=new int[2];
 ans[0]=n1[1];
 ans[1]=n2[1];
 System.out.print("Middle element:");
 for(int i=0;i<2;i++)
 {
   System.out.print(ans[i]+" ");
 }
}
}
