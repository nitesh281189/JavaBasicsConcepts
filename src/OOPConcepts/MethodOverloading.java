package OOPConcepts;

	public class MethodOverloading {
	//Method Overloading is same as function Overloading
	//We cannot create a method inside a method 
	//We cannot create a duplicate method 
	//Mehtod Overloading is when method name is same with different argument or input parameters 
	//Within the same class 
	//Same method name with different input arguments or data types is called as method overloading.
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(1, 2);
	}
	public static void main(int a) //We can overload the main method. It can be overloaded but generally it is never done so.
	{	
	}
	public void sum() 
	{
		System.out.println("SUM Method");
	}
	public void sum(int i)
	{
		System.out.println("SUM with 1 input parameter");
	}
	public void sum(int k,int l)
	{
		System.out.println("SUM Mehtod with 2 input parameter");
	}
	//SUM method is overloaded one with three kind of method defination
	}

