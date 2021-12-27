package JavaCoding;

public class ConstructorConcepts {

	//Class entity which is used to defined some class feature while creating the Objects
	//It looks like a function but not a function
	//It doesnot return the value.
	//Contructor name is class name
	
	//We can overload a constructor
	
	//Constructor is called immediately when we create the Object.
	
	//If we dont write default constructor we have hidden constructor.
	//While creating the Class its already there.
	public ConstructorConcepts() //this is default constructor 
	{
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcepts(int x) 
	{
		System.out.println("Single param Constructor");
	}
	
	public ConstructorConcepts(int x, int y) 
	{
		System.out.println("two param Constructor");
	}
	
	
	
	public static void main(String[] args) {

		
		ConstructorConcepts obj= new ConstructorConcepts();//This calls the default constructor 
		ConstructorConcepts obj1= new ConstructorConcepts(10);
		ConstructorConcepts obj2= new ConstructorConcepts(10,20);

	}

}

//Interview- When dont have Constructor and we create object of any class , then what happens ?
//hidden constructor which is also default is called 

