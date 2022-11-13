package ArralListLoop;
//create instance variable of type ArrayList in TestClass to hold instance of Ferrari and Truck classes
		// add few instances of both classes into ArrayList object
		// loop over ArrayList and call display method of objects in ArrayList.
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestClass {

	public static void main(String[] args) {
		ArrayList<String> Ferrari = new ArrayList<String>();
		Ferrari.add("####   I am a Ferrari California T,"
				+ " Im kinda a big deal.   ####");
		
		Ferrari.add("****   I am a Ferrari 488 Spider, "
				+ "I am an amazing alternative to a minivan!   ***");
		
		Ferrari.add("####   Hi, I am Ferrrari Enzo, "
				+ "don't be fooled; your imagination is not as fast as me.   ####");
		System.out.println(Ferrari);
		
		ArrayList<String> Ford = new ArrayList<String>();
		Ford.add("Ford Edge, a bangin ride. ");
		
		Ford.add("This Ford Shelby GT500, "
				+ "slightly more room then a coffin "
				+ "but small enough if needed to serve as one");
		
		Ford.add("Hi, I am the Ford Expedition Max, Im bigger then you.");
		System.out.println(Ford);
		 	
  ArrayList<String> Ferrari1 = new ArrayList<String>(Arrays.asList( "California T", "488 Spider", "Enzo") );
    
	for(int i = 0; i < Ferrari.size(); i++)
	{
	    System.out.println(Ferrari1.get(i));
	}
	
ArrayList<String> Truck = new ArrayList<String>(Arrays.asList( "California T", "488 Spider", "Enzo") );
    
	for(int i2 = 0; i2 < Ferrari.size(); i2++)
	{
	    System.out.println(Ferrari1.get(i2));
	}
}

}
	
	


