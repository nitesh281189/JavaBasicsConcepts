package JavaCoding;
public class TwoDimensionalArray {
	public static void main(String[] args) {
		String x[][]=new String[3][5]; //Two Dimension Array
		System.out.println(x.length);// this will give total number of rows
		System.out.println(x[0].length);// this will give the total number of columns 	
		// Storing the values in Array ---2 D Array 		
		x[0][0]="Nitesh";
		x[0][1]="Agrawal";
		x[0][2]="Rsystems";		
		//printing the values of 2 D array 		
		for (int i=0;i<x.length;i++)
		{
			for (int j=0;j<x[i].length;j++)			
			{				
				System.out.println(x[i][j]);// This is used to print the values of the 2 dimensional Array	
			}
		}
		
	}

}




