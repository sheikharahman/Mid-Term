package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> jr = new ArrayList<String>();
		jr.add("xbox");
		jr.add("estes");
		jr.add("googlePlay");
		jr.add("sega");
		System.out.println("Adding all values of " + jr);
		System.out.println("");
		System.out.println("printout the value using while loop with itearato");
		Iterator ir = jr.iterator();
		while(ir.hasNext()){
			System.out.println(ir.hasNext());
		}
	    jr.remove("sega");
		System.out.println("Removing the value: "+jr);
		System.out.println("");
		System.out.println("Printout the vaoue using for each loop");
		for(String sr:jr){
			System.out.println(sr);

		}

	}


}
