package OOPConcepts;

	public class CallbyValueandcallbyreference
	{
	//Call by reference is possible in Java.
   //We can pass the obj value as refernce to another reference variable of the Class.
	int p;// These are the global varibales or the Class variables(p&q)
	int q;
	public static void main(String[] args){

		CallbyValueandcallbyreference obj=new CallbyValueandcallbyreference();
		obj.sum(10,20);// 10 and 20 will be copied to x and y
		obj.p=60;// These are non static variables so called by using the object
		obj.q=70;
		
		obj.swap(obj);
	}
	//Copy of 10 and 20 is given to x and y 
	//This is call by value or pass by value 
	//Copy of the value is given and not the original value.
	//We are passing copy of the input parameters
	public int sum(int x,int y)// copy of values will be given to x and y 
	{	int a=x;
		int b=y;
		int c=a+b;
		System.out.println(c);
	return c;
	}
	
	// Call by reference in Java. 
	//In C we have pointers.Here we have Object references 
	//We pass the object reference varibale of the class
	//Object are reference varibale in Class and thus we can have call by reference.
	//t is also now refering to Obj Object.
	
	public void swap(CallbyValueandcallbyreference t) // t is the reference variable of this class.We have to pass the reference 										 // value only to the swap function.
	{
		int temp; // Swapping the values between the varibales
		temp=t.p;
		t.p=t.q;
		t.q=temp;	
	}
}
