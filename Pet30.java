class Pet30
{
    public static void main(String... ar)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print((char)(65+j));
            }
            System.out.println("");
        }
    }
}