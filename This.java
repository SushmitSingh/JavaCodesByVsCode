class This{
    public static void main(String... ar)
    {
           Temp t=new Temp();
           t.Show(20);
            System.out.println(t.x);
    }
}
 class Temp{
     int x=100;
     void Show(int y){
          System.out.println("This Is Show Method  "+y);
          System.out.println("Is Show Method By Different Argumets  "+x);
     }

 }