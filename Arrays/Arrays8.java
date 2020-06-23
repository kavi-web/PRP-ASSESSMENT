public class Arrays8
{
  public static void main(String[] args)
  {
    int[] n=new int[args.length];
   int sum=0;
   int check6=0;
   int check7=0;
    for(int i=0;i<args.length;i++)
     {
       n[i]=Integer.parseInt(args[i]);
       if(n[i]==6)
       check6=i;   
       if(n[i]==7)
       check7=i;
     } 
   if(check7>check6)
   {
    for(int i=0;i<n.length;i++)
     {
      if(i<check6 || i>check7)
       sum=sum+n[i];
     }
   }
 else
 {
  for(int i=0;i<n.length;i++)
    sum=sum+n[i];
  }
System.out.println(sum);
}
}