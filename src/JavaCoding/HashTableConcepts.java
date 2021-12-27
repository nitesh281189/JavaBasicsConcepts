package JavaCoding;

import java.util.Hashtable;
// In hash table we have key value pairs in java 
// we can also restrict the data types that can be used with these key value pairs in java 

public class HashTableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h=new Hashtable();
		h.put("name","Nitesh");
		h.put("Last Name", "Agrawal")	;	
		
		System.out.println(h.get("name"));
	}

}
