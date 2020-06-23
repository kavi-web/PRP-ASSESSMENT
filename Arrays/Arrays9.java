public class Arrays9
{
 public static void main(String[] args)
 {
    int[] n=new int[args.length];
    for(int i=0;i<args.length;i++)
    {
      n[i]=Integer.parseInt(args[i]);
    }
    int[] m=new int[n.length];
    int k=0;
    for(int i=0;i<n.length;i++)
     {
       if(!(n[i]==10))
        {
          m[k]=n[i];
          k++;
        }
     }
   for(int i=0;i<m.length;i++)
   {
     System.out.print(m[i]+" ");
   } 
}
}