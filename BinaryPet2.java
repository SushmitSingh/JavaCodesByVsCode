class BinaryPet2
{
     static int j=0;
    public static void main(String... ar)
    {
       
        for(int i=1; i<=25;i++)
        {
            if(j%2==0)
            {
                  System.out.print("1");
            }
            else{
                  System.out.print("0");
            }
            if(i%5==0)
            {
                j++;
               System.out.println("");
            }
        }
    }
}