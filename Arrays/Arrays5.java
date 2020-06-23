import java.util.*;
public class Arrays5
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
   int temp=0;
   for(int i=0;i<size;i++)
    {
     for(int j=i+1;j<size;j++)
     {
      if(arr[i]>arr[j])
      {
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
      }
     }
    }
  System.out.println("Largest 2 numbers="+arr[arr.length-1]+" and "+arr[arr.length-2]);
  System.out.println("Smallest 2 numbers="+arr[0]+" and "+arr[1]);   
}
}
