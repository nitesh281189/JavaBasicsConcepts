package JavaCoding;

import java.lang.Math;
public class Armstrong {
	public static void isArmStrong(int num)
	{	int i=num;
		int t,sum=0;
		while (num>0) {
		t=num%10;
		sum=sum+(t*t*t);
		num=num/10;}
		if (sum==i) System.out.println("ArmStrong");
		else System.out.println("Not Armstrong");}
	public static void main(String[] args) {
	//WAP to find the Armstrong Number 
		isArmStrong(1);
	}}
