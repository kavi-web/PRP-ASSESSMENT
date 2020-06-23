public class Arrays10
{
 public static void main(String[] args)
  {
    int[] n=new int[args.length];
   for(int i=0;i<args.length;i++)
   {
     n[i]=Integer.parseInt(args[i]);
   }
  int[] arr=new int[n.length];
  int k=0;
  for(int i=0;i<n.length;i++)
   {
     if((n[i]%2==0)||n[i]==0)
     {
       arr[k]=n[i];
       k++;
     }
   }
   for(int i=0;i<n.length;i++)
   {
     if(!(n[i]%2==0))
     {
       arr[k]=n[i];
       k++;
     }
   }
  for(int i=0;i<arr.length;i++)
   {
     System.out.print(arr[i]+" ");
    }
}
}