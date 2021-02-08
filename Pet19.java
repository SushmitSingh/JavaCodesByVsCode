class Pet19
{
    public static void main(String... arg)
    {
        int k=65;
        for(int i=0; i<5; i++)
        {
            int t=0;
            if(i<4){
                 t=6;
            }
            else{
                t=7;
            }
            for(int j=1; j<t; j++)
            {
               System.out.print((char)k);
                ++k;
            }
            System.out.println("");
        }
    }
}