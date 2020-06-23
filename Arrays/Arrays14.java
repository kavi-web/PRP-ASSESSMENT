public class Arrays14
{
  public static void main(String[] args)
   { 
       int[][] num=new int[3][3];
       int k=0;
       if(args.length==9)
        {
          for(int i=0;i<3;i++)
            {
               for(int j=0;j<3;j++)
                    {
                      num[i][j]=Integer.parseInt(args[k]);
                      k++;
                    }
             }
           System.out.println("The given array is :");
           int max=num[0][0];
           for(int i=0;i<3;i++)
            {
               for(int j=0;j<3;j++)
              { 
                System.out.print(num[i][j]+" ");
                if(num[i][j]>max)
                max=num[i][j];
              }
              System.out.println();
           }
         System.out.println("The biggest number in the given array is "+max);
         }
     else
     {
     System.out.println("Please enter 9 integer numbers");
     }
}
}