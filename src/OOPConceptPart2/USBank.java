package OOPConceptPart2;

	public interface USBank 
	{
	int min_bal=100;
	public void credit ();
	public void debit ();
	public void transfermoney();
	
	//We have no main method in Interface.
	// In interface we dont give method body.We have only method declaration
	// Only method prototype 
	// In interface we can declare the varibales and these are static in nature by default 
	//variables value will not be changed.Its is final/Constant in nature. 
	// No Static methods in the interface and no main method also . Static methods are not allowed.
	// We cannot create Object for interface.Interface are abstract in nature.We cannot instantiate(Create Objects)
	// Interface are parts of the Objects but we cannot create Objects for interface.
	// No Static methods 
	
}
