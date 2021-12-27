package OOPConcepts;

public class FunctionsinJava {
	//Functions and methods are same thing.
	//In Some programming language they are called as functions 
	//While in some programming languages they are called as methods 
	//Functions and methods are same thing in nutshell.
	// main method or main function
	// It never returns a value and hence main method is always void.
	//Functions are just like factory.If we pass some input it will give me output.
	//Three types functions are mainly used.
	//We can have any number of function is program
	//We dont write method inside the main.
	//Main Method is starting point of execution.
	
	//Non Static methods always use an Object.It is important to do so.
	public static void main(String[] args)
	{
	//Non Static methods 
	//When we have to access the methods we have to create Objects.
	FunctionsinJava obj=new FunctionsinJava(); // Object is new FunctionsinJava
	
	//When Object is created,obj is the reference variable of this Object
	// after creating the object,the copy of all non-static method will be given to the object 
	// If we have to call non static method of any class we have to create Object and use Object refernce variable with dot notation
		obj.test();
		obj.pqr();
		int n=obj.abcd();
		System.out.println(n);
		int div=obj.division(30,10); //We have to pass the variable values to the method 
							//Using the Object reference variable.
		System.out.println(div);
	}
	// not returning any value 
	// if mehtod is not called then they are not excuted.calling is to be done inside the main method.
	
	public void test()   //this is a testing method.It is not capable of returning any value.
	{					//No input no putput 
		System.out.println("My name is nitesh");
	}
	public void pqr()
	{
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;
	}
	//void : Doesnt return any value.The method doesnt return any value when called.
	//return type is int 
	public int abcd() {//no input some output 
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public int division(int x,int y) //x,y are called as input arguments 
	{	//Some Input and some output.
		System.out.println("div method");
		int d=x/y;
		return d;
	}
}




	
	

