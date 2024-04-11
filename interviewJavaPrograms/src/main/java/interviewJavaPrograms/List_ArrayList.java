package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_ArrayList {
	
	    public static void main(String[] args) {
	    	 List<String> myList = new ArrayList<>();
	         myList.add("Apple");
	         myList.add("Banana");
	         myList.add("Orange");
	         
	         System.out.println("Elements in the list:");
	         for (String fruit : myList) {
	             System.out.println(fruit);
	        }
	    }
	}
