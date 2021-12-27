package OOPConceptPart2;

public class BMW extends Car 	
	// When we create relationship between two classes we use extends keyword
	//With the help of extends keyword the BMW will inherit the properties of the 
	//Car class. So Car is a Super Class or the parent class and BMW is the Child or the Sub Class.
	// BMW has access on the methods of the Car class
	{
	public void start() //Overidden Method
	{	//BMW has its own start method.
		System.out.println("BMW-Start");
		}
	public void threatsafety() //This method is specific to bmw class.
	{
		System.out.println("Threat Safety feature");
	}
}
