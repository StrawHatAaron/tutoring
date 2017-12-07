import java.util.*;
import java.util.ArrayList;
public class Gen<E> {
	private int val;
	
	Gen(){
		this.val = 0;
	}
	
	public static void main (String[] args) {
		Gen gen1 = new Gen();
		Gen gen2 = new Gen();
		Gen gen3 = new Gen();
		//create the generic "soGeneric"
		List<Gen> soGen = new ArrayList<Gen>();
		soGen.add(gen1);
		
		
		//ArrayLists 		
		List<String> arrayList = new ArrayList<>();//notice we can take out "String" from the last <> put you can put it there too 
		
		arrayList.add("first string");
		arrayList.add("second string");
		arrayList.add("third string");
		
		System.out.println("print out the entire arrayList with a for each loop");
		for(String s: arrayList)
			System.out.println(s);
		
		//we can get an index of the ArrayList just like a normal Array
		System.out.println();
		System.out.println("Index 0 of arrayList below");
		System.out.println(arrayList.get(0));
	}
}
