import java.util.Scanner;
class Happynum{
    public static void main(String... arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number For Checking Happy Number Or Not");
        int GetNumber = sc.nextInt();
          recheck(GetNumber);}
   static void  recheck(int Number) {
         int GetNumber = Number;
          int squofCharater=0;
        while(GetNumber!=0)  {
            int character = GetNumber;
             GetNumber=GetNumber/10;
             character=character%10;
             squofCharater=squofCharater+(character*character);
             System.out.println(GetNumber+" Hello "+character+" Java"+squofCharater);}
              if(squofCharater==1) System.out.println("Number Is Happy");
              else{
                 if(squofCharater<=9 || squofCharater==0) System.out.println("Number Is Not Happy");
                 else recheck(squofCharater); }}}