import java.util.Scanner;

interface Factorial1
{
public void cal();
}
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Factorial1 f1=new Factorial1()
				{
			public void cal()
			{
				System.out.println("Enter the factorial number");
				int num=sc.nextInt();
				int fact=1;
				for(int i=1;i<=num;i++)
				{
					fact=fact*i;				
				}
				System.out.println("factorial:"+fact);
			}
				};
				f1.cal();
	}
}