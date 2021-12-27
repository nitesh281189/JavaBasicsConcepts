package OOPConceptPart2;

	public class Car extends Vechile //Has a relationship 
	//Vechile is the parent class for the Car Class.
	//Car inherits properties from the Vechile Class.
	//When Only designing and not executing then main method is not used.
	{
	public void start() {	
		System.out.println("CarStart");
	}
	public void stop() {
		System.out.println("CarStop");	
	}
	public void refuel() {
		System.out.println("Refuel");
	}
}



