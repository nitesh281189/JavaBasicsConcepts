package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		// We cannot change the value of the static variables (Interface variable)
		// It is Final in nature and cannot be changed 
		// It is accessd by Class name 
		
		System.out.println(USBank.min_bal);
		
		//USBank.min_bal=250; We cannot the value of the variable.
		
		HSBCBank HS= new HSBCBank();
		
		HS.credit();//Overriden Methods(This is again Compile time polymorphism)
		HS.debit();
		HS.carloan();//Seperate Methods 
		HS.educationloan();//Seperate Methods of HSBC Class. 
		HS.transfermoney();
	
		//Dynamic Polymorphism 
		//Child Class Object can be refferd by Parent Interface reference variable 
		
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		// Only and Only Overriden Methods are called and we cannot use to call the seperate Methods.
	}

}
