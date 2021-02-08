class Pet20
{
    public static void main(String... ar){
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i%2==0) System.out.print((char)(64+j));
                 else System.out.print("*");
            }
            System.out.println();
        }
    }
}