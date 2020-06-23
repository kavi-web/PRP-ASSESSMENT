import java.util.*;
public class Arrays7
{
  public static void main(String[] args)
  {
   int[] n=new int[args.length];
   LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
   for(int i=0;i<args.length;i++)
   {
     n[i]=Integer.parseInt(args[i]);
     l.add(n[i]);
    }
  for(Integer x:l)
  {
    System.out.print(x+" ");
  }
}
}
