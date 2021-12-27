package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//Creating the Object of BMW Class as it is publicily defined
		// when same method is present in Child class as well as parent class with same name and same number of arguments , 
		// It is Called as method Overriding.
		//Preference is given to Child Class method.
		// Method overriding is different from Method overloading.
		
		//Static polymorphism or compile time polymorphism  
		//At the time of compilation time Java decides which method needs to be called for execution
		BMW obj=new BMW();
		obj.start(); 	//When the method is common between Child and parent , preference is given to Child Class and not parent
		obj.stop();		//Inheriting from parent Class.
		obj.refuel();	//Inherting from Parent Class.
		obj.threatsafety();//avaliable in BMW Car Class
		obj.engine();//Called from Vechile Class(Grandparent Class)
		 
		 //Polymorphism: this means method overriding (One to many).Same method we have in Parent Class as well as Child Class.
	     //Parent cannot access the methods of Child Class. Parent cannot inherit Child Properties  
		 Car c=new Car();
		 c.start();
		 c.stop();
		 c.refuel();
		 //c.threatsaftey(); Car class cannot access the property of the BMW Class as Car is parent and BMW is child.
		 System.out.println("***************************************************");
		 
		 //Top casting 
		 Car c1=new BMW(); // Child Class Object can be referenced by parent Class reference varibale
		 				  //  This is called dynamic polymorphism or run time polymorphism (Very Important)
		 
		 c1.start();// preference is given to Overriden Method (Method of Child class)
		 c1.stop();
		 c1.refuel();
		 //c1.threatsafety();-->This cannot be accessed. // We cannot call Child Class methods by using Parent Class reference variables
		// Only and Only Overidden methods and Parent Class methods are called by using dynamic polymorphism 
		

		 // Down casting : It is not allowed will give exception at run time. Will give Error during the Compile time.
		 //BMW b1=new Car();  // this is not allowed. Parent cannot be fit into Child Class reference variables//This is called as down casting.
		 
		 // We have to cast it. We have to make it into BMW Class Object
		 //But at the run time it is going to give an Exception knwon as Class Cast Exception 
		 //Car object cannot be casted to BMW type.It is beacause at the compile time java will be confused
		 //At run time it is not allowed. It will give Class Cast Exception.
		 BMW b1=(BMW) new Car();//We are casting it to BMW.
		 // we have ClassCastException 
		 
		 //Only and only overidden methods and parent methods will be called using dynamic polymorphism 
		 
	}

}
