package OOPConcepts;

	public class WrapperClassConcept {
		//Data Conversion
	public static void main(String[] args) {
		String s="100";
		//Convert String into Interger
		System.out.println(s+20);
		//We have to Use Wrapper Class Concept.
		int i=Integer.parseInt(s); // Integer is a wrapper Class 
		//Intger.parseInt is a method to convert String to Integer //Data Conversion.
		System.out.println(i+20);
		//We have multiple wrapper classes in java 
		//Integer,double, Character, Boolean
		//Integer to String Conversion 
		int j=200;
		String a=String.valueOf(j);
		System.out.println(a+"Conevrsion Happened");
		//Important Interview Ques
		String u="100A";//String is a class and not a data type.
		Integer.parseInt(u);// Number Format Exception
		//When Conversion is not a pure numeric value. 
		//100A is not a pure numeric value.
		//We get number format exception
	}
}
//We dont have String to Character direct wrapper Class but yes to other data types we have.
	