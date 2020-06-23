public class Arrays1
{
 public static void main(String[] args)
{ 
  int[] n=new int[args.length];
  int sum=0;
  int average=0;
  for(int i=0;i<args.length;i++)
  {
    n[i]=Integer.parseInt(args[i]);
  }
  for(int i=0;i<n.length;i++)
  {
    sum=sum+n[i];
  }
  average=sum/(n.length);
  System.out.println("sum of the given arry="+sum);
  System.out.println("Average of the given array="+average);
}
}