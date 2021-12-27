package JavaCoding;

import java.util.ArrayList;

//Array List Class is a resizable array that is found in java Utils package 

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("TOM");
		ar.add("DICK");
		ar.add("HARYY");
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		for (int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		

	}

}
