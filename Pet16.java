class Pet16
{
    public static void main(String... ar)
    {
            for(int i=0; i<5; i++)
            {
               
                for(int j=5; j>0; j--)
                {

                    System.out.print((char)(64+i+j));
                }
               
                System.out.println("");
            }
    }
}