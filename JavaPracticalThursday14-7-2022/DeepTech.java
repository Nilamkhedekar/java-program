//Prints the numbers from that 1 to 100 such that:if the number is a multiple of 3,you need to print "Deep" instead of that number.if the number is a multiple of 5,you need to print "Tech" instead of that number.if the number is a multiple of both 3 and 5,you need to print "DeepTech" instead of that number.
public class DeepTech {
	public static void main(String[ ]args)
    {
      for (int i=1; i<=100; i++)
          {
             if(i%3==0)
             {
                System.out.println("Deep");
             }
            else if(i%5==0)
             {
                System.out.println("Tech");
             }
             else if(i%3==0 && i%5==0 )
             {
                System.out.println("DeepTech");
             }
            else
            {
                System.out.println(" "+i);
            }
         }     
     }
}
	 
	               


