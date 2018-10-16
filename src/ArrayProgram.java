import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> addCollection=new ArrayList<>();
		
		
		addCollection.add("kuljeet");
		addCollection.add("jeet");
		addCollection.add("Shubham");
		addCollection.add("sourabh");
		addCollection.add("jeet");
		addCollection.add("kuljeet");
		
		Set<String> unique = new HashSet<String>(addCollection);
		for (String key : unique) {
		    System.out.println(key + ": " + Collections.frequency(addCollection, key));
		}
		Iterator<String> iterator=addCollection.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		for(String string: addCollection)
			System.out.println("For  : "+string);

		
		
	}

}
