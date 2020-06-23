import java.util.*;
public class Arrays2
{
 public static void main(String[] args)
  {
    int[] n=new int[args.length];
    for(int i=0;i<args.length;i++)
     {
       n[i]=Integer.parseInt(args[i]);
     }
    int min=n[0];
    int max=n[0];
    for(int i=0;i<n.length;i++)
    {
         if(n[i]>max)
           {
            max=n[i];
           }
         else if(n[i]<min)
           {
            min=n[i];
           }
    }
    /*Arrays.sort(n);
    int min=n[0];
    int max=n[(n.length)-1];*/
   System.out.println("Minimum value="+min+"\nMaximum value="+max);
}
}