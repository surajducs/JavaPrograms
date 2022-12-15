package non_static_block;

public class Employ {
	{
		System.out.println("This is non_static block-1");
	}

	public static void main(String[] args) {
		
	  System.out.println("This is main methods");
	  
	  Employ e1=new Employ();
	  
	  System.out.println("===================");
	  
	  Employ e2=new Employ();
	  
	  System.out.println("=================");
	  
	  Employ e3=new Employ();
	  
	  System.out.println("=================");
	  Car c1=new Car();
	  Car.demo();

	}
	
	{
		System.out.println("This is non_static block-2");
	}
	
	{
		System.out.println("This is non_static block-3");
	}

}
