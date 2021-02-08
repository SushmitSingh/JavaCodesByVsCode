class lass {
    public static void main(String... ar)
    {
         // Geting gt=new Geting();
        // gt.show(); 
         System.out.println(new Geting(10000).i);
         System.gc();
    }
}
class Geting {
        int i;
            /* void show(){
             System.out.println("This Is Show Method");
           } */
  Geting(int j)
    {
        this.i=j;
        //System.out.print("This Is Cunstructer");
    }

}