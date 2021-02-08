import java.util.Scanner;
class GoldBatch
{
    public static void main(String... arg)
    {
      Scanner sc=new Scanner(System.in);
      int GetNumber=sc.nextInt();
      
      if(GetNumber>0 && GetNumber%2==0) {
          System.out.println("May Be A Goald Batch");
             int number1=GetNumber/2;
             int number2=GetNumber/2;
             while(number1>0 || number2<GetNumber) {   
                 int count=0;
                 int count2=0;
                 for(int i=1; i<=number1; i++) {
                     if(number1%i==0)
                      count++;
                 }
                 for(int j=1; j<=number2; j++){
                     if(number2%j==0)
                      count2++;
                 }
                 if(count==2 && count2==2){
                    System.out.println(number1+ "  Number Sets  "+number2);
                 }
                 number1--;
                 number2++;
             }
      }
      else System.out.println("Not A Goald Batch ___-==A goald Batch Number Is A Positive Even Integer That Can Be Expressed as The Sum Of Two Odd Primes");
    }
}