package JavaCoding;

public class IsElseStatement 
{

	public static void main(String[] args) 
	{
		int a=300;
		int b=200;	
		if (a>b)
		{
			System.out.println("A is bigger than b");
		}
		else 
		{
			System.out.println("B is bigger than A ");
		}
		//wap to find the highest among 3 numbers 
		//a1=100 b1=200 c1=300
		int a1=100;
		int b1=2;
		int c1=10000;
		//nested If Condition
		if((a1>b1)&(a1>c1))
		{System.out.println(a1);}
		else if (b1>c1)
		{System.out.println(b1);}
		else {System.out.println(c1);}
		
		}
}
