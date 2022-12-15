package non_static_block;

public class Car {
	{
		int x=100;
		String a="Suraj";
		System.out.println(x+" "+a);
	}

	public static void main(String[] args) {
		
		System.out.println("This is main methods");

	}
	public static void demo()
	{
		System.out.println("this is time pass");
	}

}
