class Pet29
{
    public static void main(String... ar)
    {
        int k=0;
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(++k);
            }
            System.out.println("");
        }
    }
}