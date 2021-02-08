class StarNum
{
    public static void main(String... ar)
    {
        for(int i=0; i<=4; i++)
        {
            for(int j=0; j<=5; j++)
            {
               if(i%2==0)
               {
                   System.out.print("  "+"*");
               }
               else
                    System.out.print(" "+i+1);
            }
            System.out.println("");
        }
    }
}