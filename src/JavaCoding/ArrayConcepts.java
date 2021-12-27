package JavaCoding;

public class ArrayConcepts {

	//Purpose Of Array Variables 
	//In Normal varibale at a time we can store only one value
	//If we try to store multiple value to a normal variable we are not allowed to do so by java 
	//If we want to store more than one value in single variable
	//In Array we store similar data types values in Array Variable
	public static void main(String[] args) {
		//Array 
		//One Dim Array-Static array 
		//Declaration of Integer Array
		int i[]=new int[4];//We have to use [] and new keyword
		// This array varibale can store 4 values . It has 4 blocks in memory to store data 
		//Lowest bound or index =0
		//Upper bound or index=length-1 
		i[0]=1;
		i[1]=2;
		//System.out.println(i[0]);
	    //System.out.println(i[4]);//ArrayIndexOutOfBoundException. When we try to access the values that is outside of Array length
		//System.out.println(i.length);// this will give you length and size of array 
		//To print all the values of the array 
		//for (int j=0; j<i.length;j++)
		//{System.out.println(i[j]);
		//}
		//	double d[]=new double[5];
		//	d[0]=1.1;
		//	d[1]=2.2;
		//	d[3]=4.3;
		//	d[4]=4.5;
		//	d[2]=10.34;
		//	for (int j=0; j<i.length;j++)
		//	{
		//		System.out.println(d[j]);
		//	}
		//	char c[]=new char[10];
		//	boolean b[]=new boolean[2];
		//	String s[]=new String[10]; String Array Varibale String is not a data type. It is a class but we can create String Array also.
		//	System.out.println(s.length);
		//	System.out.println(s[0]);
		//  We have given 1 Square brackets and above all these are one dimensonal array
		//	******************************************************************************************************************
		//Disadvantages of Array
		//Size is fixed.We cannot modify the size of the array. This is called Static Array
		// We cannot store the values more than the value assgined to the Array. Hence it is called as static Array
		//It Stored only similar data types values.It cannot store mix data types values.
		//If we want to store different data types for single variables. To overcome this problem
		//we use Object Array.We also use collections. Collections are also called dynamic array.Array list, hash tables,dynamic array
		
		
		
		//  Object Array-(Object is class.It is the Superclass of all the Class.)
		//  We can store diff data types values 
		// It is used to store different data types values.
		
	
			Object ob[]=new Object[5];
			
			ob[0]="Tom";
			ob[1]=25;
			ob[2]="London";
			ob[3]='M';
			
			for (int a=0;a<ob.length;a++)
			{
				System.out.println(ob[a]);
			}
  }
}


