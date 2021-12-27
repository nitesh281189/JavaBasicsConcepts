package OOPConceptPart2;

	public class HSBCBank implements USBank,BrasilBank //We are achieving multiple Inheritance.Two parent of Single Class
	{
		// Is a realtionship - Sometime this is also called as is a relationship. Class and Interface relationship.
		// Has a relationship-Class-Class relationship.
		// As this class implements US bank interface we have to compulsory define 3 methods of the US bank Interface 
		// It can have its own methods also 
		// Business logic is to be of the HSBC Bank but the compulsory methods of US Bank Interface to be implemented.
		// Overriding US Bank Methods.It Should Override.
		public void credit()
		{
			System.out.println("HSBC Credit ");
		}
		public void debit()
		{
			System.out.println("HSBC Debit");
		}
		public void transfermoney()
		{
			System.out.println("HSBC transfermoney ");
		}
		
		// Seperate Method of HSBC Class.
		public void educationloan ()
		{
			System.out.println("edu loan");
		}
		public void carloan()
		{
			System.out.println("car loan");
		}
		
		//define brasilbank method.OVerriding from Brasil Bank 
		public void mutualfund()
		{
			System.out.println("HSBC Mutual Fund");
		}
	}
	
	



