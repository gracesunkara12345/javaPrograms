package interviewJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class Set_Hashset {
	
	    public static void main(String[] args) {
	        Set<String> mySet = new HashSet<>();
	        mySet.add("Apple");
	        mySet.add("Banana");
	        mySet.add("Orange");
	        mySet.add("Apple"); // Adding a duplicate element
	        
	        System.out.println("Elements in the set:");
	        for (String fruit : mySet) {
	            System.out.println(fruit);
	        }
	    }
	}
