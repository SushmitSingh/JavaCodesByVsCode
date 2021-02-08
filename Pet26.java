class Pet26
{
    public static void main(String... arg)
    {
        int ic=1;
        for(int i=0; i<=4; i++)
        {

            for(int j=0; j<=i; j++)
            {
                System.out.print(ic-j);
            }
            ic=ic+2;
            System.out.println("");
        }
    }
}