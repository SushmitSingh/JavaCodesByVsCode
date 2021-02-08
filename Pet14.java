class Pet14
{
    public static void main(String[] ar)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
               if(i%2==0)
               {
                  if(j%2==0)
                  {
                      System.out.print("0");
                  }
                  else{
                      System.out.print("1");
                  }
               }
               else{
                   
                      if(j%2==0)
                  {
                      System.out.print("0");
                  }
                  else{
                      System.out.print("1");
                  }
               }
            }
            System.out.println("");
        }
    }
}
class Pet14b
{
    public static void main(String[] arg)
    {
        for(int i=1; i<=25; i++)
        {
           
            if(i%2==0)
            {
                System.out.print("0");
            }
            else
            {
                System.out.print("1");
            }
             if(i%5==0)
            {
                System.out.println("");
            }
        }

    }
}