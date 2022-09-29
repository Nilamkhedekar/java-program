import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[ ]args)
	{
		int num, sum=0, rem;
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in) ; 
		num=sc.nextInt();  
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else 
		{
			System.out.println("Number is negative");
		}
	}
}
	         

