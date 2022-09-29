import java.util.Scanner;
public class Reversed {
	
	   public static void main(String[ ]args)
	      {
	        int num, n=0, rem;
	        System.out.println("Enter Number:");
	        Scanner sc=new Scanner(System.in) ; 
	        num=sc.nextInt();  
	        while(num!=0)
	        {
	                rem=num%10;
	                num=num/10;   
	                n=n *10+rem;
	        }
	        System.out.println("Reversed number:"+n);
	     }

}
