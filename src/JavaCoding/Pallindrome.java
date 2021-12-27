package JavaCoding;

public class Pallindrome {
// WAP to find the pallindrome number 
//Reverse of numberis same of the original number
	public static void isPallindrome(int num){
		int i=num;int sum=0;int t=0;
		while (num>0) {
		t=num%10;
		sum=(sum*10)+t;
		num=num/10;}
		if (i==sum)
			System.out.println("Number is pallindrome");
		else 
			System.out.println("Number is not pallindrome");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPallindrome(152);
	}}
