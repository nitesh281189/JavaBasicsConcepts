package JavaCoding;

public class StringConcatenation {

	public static void main(String[] args) 
	{
		//Main method is important to execute the program
		int x=100;//Primitive data type 
		int y=200;//Primitive data type
		String A="Hello World"; //String variables
		String B="I am Nitesh Agrawal"; //String Variables
		System.out.println(x+y+A+B); //Left to write execution
		System.out.println(A+B+x+y);//ImportantInterviewquestion
		//Execution happens from left to write 
		System.out.println(A+B+(x+y));
		//x+y is perfomred first and then A+B is added 
		//Execution is to be step by step.Can be asked in Interview
		double c=12.33;
		double d=10.33;
		System.out.println(A+B+c+d);
		//+ is called as concatenation operator
		System.out.println("The values is a is "+100);
		System.out.println("The addition of A and B is="+A+B);
		//println is used to create new line
		//println is used to print on console or output on new line 
		//print is just used to print on console
	}
}
