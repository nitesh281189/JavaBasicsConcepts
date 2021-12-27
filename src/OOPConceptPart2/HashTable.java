package OOPConceptPart2;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
	
		
		Hashtable h=new Hashtable();
		//We have to put value in terms of keys, values 
		
		h.put("A","Test");
		h.put("B", "Hello");
		h.put("C","World");
		
		//String values are not neccessary. We can give integer values also in both Key Value Pair 
		
		
		System.out.println(h.size());
		// value of particular key 
		System.out.println(h.get("C"));// value of the particular key 
		
		h.put(1, "TOM"); // We can use any combination of Values
		
		// We can restrict to particular data type also 
		
		Hashtable<Integer,Integer> h2=new Hashtable<Integer,Integer>();
		
		//h2.put("Nitesh","Agrawal")// This is not allowed as this is Integer hashtable 

	}

}
