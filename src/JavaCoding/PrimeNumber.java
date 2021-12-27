package JavaCoding;

public class PrimeNumber 

{

	public static boolean isPrime(int num)
	{
		
		//Negative integers are not considered a prime number
		//Checking the edges 
		if (num<=1)
			return false;
		
		for (int i=2;i<num;i++)
			if (num%i==0) return false;
			 return true;
			
	}
	
	public static void getprimenumbers()
	{
	for (int i=2;i<=20;i++)
		if (isPrime(i)==true) System.out.println("Prime Number="+i);
	
	}
			
		
	public static void main(String[] args)
	{
		
		//WAP to find the prime numbers between 1 and 10 
		//Prime Number is the number which are divisible by one and itself only
		getprimenumbers();
		
	}
}


