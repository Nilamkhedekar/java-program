import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String[]args)
	{
		ArrayList<String>arr=new ArrayList<String>();
		arr.add("Red");
		arr.add("Green");
		arr.add("Blue");
		arr.add("Pink");
		arr.add("Gray");
		arr.add("Yellow");
		arr.add("White");
		arr.add("Black");
		System.out.println(arr);
		arr.remove(3);
		System.out.println("After Removing:");
		System.out.println(arr);
		System.out.println("The element at 2nd index "
				+ "is:"+ arr.get(2));
	}

}
