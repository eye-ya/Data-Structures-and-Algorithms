import java.util.ArrayList;

public class PhoneBookDemo {
	public static void main(String[] args)
	   {
		Entry e1 = new Entry ("Ashley","(123)456-7890");
		Entry e2 = new Entry ("Aya","(098)765-4321");
		Entry e3 = new Entry ("August","(483)312-4902");
		Entry e4 = new Entry ("Allen","(321)321-9310");
		Entry e5 = new Entry ("Alvin","(454)909-6794");

		ArrayList<Entry> entryList = new ArrayList<>();
	      
	    entryList.add(e1);
	    entryList.add(e2);
	    entryList.add(e3);
	    entryList.add(e4);
	    entryList.add(e5);
	      
	      
	    System.out.println("The ArrayList has " + entryList.size() + " objects stored in it.");
	      
	    for(Entry name : entryList )
	         System.out.println(name);
	      
	   }
}
