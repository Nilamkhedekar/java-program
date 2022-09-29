import  java.util.Scanner;
public class SumOfDigit {
	public static void main(String[ ]args)
    {
      int num,sum=0, rem;
      System.out.println("Enter Number:");
      Scanner sc=new Scanner(System.in) ; 
      num=sc.nextInt();  
      while(num!=0)
      {
              rem=num%10;
              sum =sum+rem;   
              num=num/10;
      }
      String sumofdigit;
	  System.out.println("Sum Of Digits:"+sum);
   }

}
