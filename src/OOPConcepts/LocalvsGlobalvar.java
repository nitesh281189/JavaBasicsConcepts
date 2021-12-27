package OOPConcepts;

	public class LocalvsGlobalvar {
	String name="Top";	 //Global variables or Class variables.(Non Static Varibales.)
	int age=25;			 //Global varibales or Class variables.
	//Scope of global varibales will be throughout the program.
	public static void main(String[] args) {
		int i=10;// This is local varibales for the main method. 
				//the Scope of i variable is only inside the main method 
        //To access the global varibales we have to create Object of the Class.
		//Without the Object creation we cannot access the global variable.
		//Copy of Non-Static methods is also given to Object.
		//Cannot use them directly,We need Object reference variable.
		LocalvsGlobalvar obj=new LocalvsGlobalvar();
		System.out.println(obj.age);
	}
		public void sum()
		{
		int i=15; // this i is only inside the sum method and is not avaliable outside the sum method.
		int j=20;
		int age=25; //This is local varibales for the sum method.
					//Scope of i is only inside the sum method.
	}
}
