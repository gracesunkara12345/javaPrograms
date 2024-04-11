package interviewJavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOccuWordCount {
 
	public static void main(String[] args) {
		String str = "Praise the lord Praise the God always";
		String arr[] = str.split(" ");
	Map <String , Integer> map = new HashMap<>();
		for (String wrd : arr) {
			if(map.containsKey(wrd))
				map.put(wrd, map.get(wrd)+1);
			else
				map.put(wrd,1);
		}
	
		System.out.println(map);
	}
}