package DuplicateFromList;

import java.util.ArrayList;

public class DuplicateFromList {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ArrayList<String> ar1=new ArrayList<String>();
		ArrayList<String> ar2=new ArrayList<String>();
        ar.add("Hari");
		ar.add("bala");
		ar.add("yogi");
		ar.add("arjun");
		ar1.add("Raghu");
		ar1.add("Tarak");
		ar1.add("Ali");
		ar1.add("arjun");
		ar2.add("Hari");
		ar2.add("bala");
		ar2.add("yogi");
		ar2.add("arjun");
		ar2.add("Raghu");
		ar2.add("Tarak");
		ar2.add("Ali");
		for(int i=0;i<ar.size();i++) {
			if(ar1.contains(ar1.get(i))) {
				if(ar2.contains(ar1.get(i))) {
					System.out.println(ar.get(i));

				}

			}
		}
	
	}
}
