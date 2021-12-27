package OOPConcepts;

public class Car {
	//Class varibales are also called as Global variables 
	int model;
	int wheel;
	//It is important to have main method to execute any program
	//Generally we dont drive any code in main method.
	public static void main(String[] args) {
		Car a=new Car();// Right hand side(new Car();) is called Object and 
						// a is referencing the Object.
						//a is object reference variable.
		//Properties of the Object are the Class property
		//Class and Object is really important.
		Car b=new Car();
		Car c=new Car();
		//new Car();----> This is the object of the Car Class.It is representing the new Object.
		//a,b,c, are representing the Objects. These are also known as object reference variables.
		//Class varibales are given to each and every Object.
		//When Object is avaliable in memory without reference.
		
		a.model=2015;
		a.wheel=4;
		b.model=2014;
		b.wheel=4;
		c.model=2013;
		c.wheel=4;
		System.out.println(a.model);
		System.out.println(a.wheel);	
		System.out.println("After the reference is changed");
		a=b;
		b=c;
		c=a;
		a.model=10;
		System.out.println(a.model);
		c.model=20;
		System.out.println(a.model);
		
		
		
		
		
	}
}
