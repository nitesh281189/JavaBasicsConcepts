package OOPConcepts;

public class StaticandNonStaticMethod
{
	// Global varibales:The Scope of Global varibales is within all the functions of the class with some conditions based 
	//i.e. it depends on method or varibale is static or non-static.
	String name="Tom";//Non Static Global varibale or Class variable.
	static int age=25;//Static Global varibale or Class variable.
	public static void main(String[] args) {
		// How to call Static varibales and methods ?
		//1. Direct Calling 
		sum();
		//2. Calling by Class name 
		StaticandNonStaticMethod.sum();
		//Similarly We can call varibale also 
		System.out.println(age);
		System.out.println(StaticandNonStaticMethod.age);
		//Can we access static methods by object reference ?
		// yes we can do but it is not recommende practise
		StaticandNonStaticMethod obj=new StaticandNonStaticMethod();
		obj.sum(); // It gives warning that Static methods should be called either by direct calling or by using class name 
	}
	public void sendmail() // Non Static Method 
	{
		System.out.println("Send Mail Mehtod");	
	}
	
	public static void sum() // Static method 
	{
		System.out.println("SUM Method");
	}
}
//Static varibales and Static methods are not part of the Object. They have seperate common memory location
//Object have acess to the Common memory location of the Static variables and methods 


