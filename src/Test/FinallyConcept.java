package Test;

public class FinallyConcept {
	//It is used in association with try catch block and gurantees the finally block will be excuted after try catch block.
	//The code will be executed inside the finally.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	test1();
	
	}
	
	public static void test1()
	
	{
		try {
			
			System.out.println("Inside test 1 method");
			throw new RuntimeException("test");
		}
		
		
		catch(Exception e)
		{
		System.out.println("Inside catch block");	
		}
		
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	
}
