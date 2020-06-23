public class Arrays13
{
 public static void main(String[] args)
 {
   int[][] num=new int[2][2];
   int k=0;
   if(args.length==4)
    { 
      System.out.println("The given array is :");
      for(int i=0;i<2;i++)
       {
         for(int j=0;j<2;j++)
          {
            num[i][j]=Integer.parseInt(args[k]);
            k++;
            System.out.print(num[i][j]+" ");
          }
        System.out.println();
       }
      System.out.println("The reverse of the array is :");
      for(int i=2;i>0;i--)
      {
        for(int j=2;j>0;j--)
         {
           System.out.print(num[i-1][j-1]+" ");
         }
      System.out.println();
      }
     } 
    else
     {
       System.out.println("Please enter 4 integer numbers");
     }
}
}