package interviewJavaPrograms;

/* String splitted into Word and Number of words in given string*/
import java.util.HashMap;
import java.util.StringTokenizer;

public class StringToWordSplit {

	public static void main(String[] args) {
		String str = "sahi sahiti hhad gsdgsd";

		String arr[] = str.split(" ");
		System.out.println("String into Words : ");

		for (String wrds : arr) {
			System.out.println(wrds);
		}
		int n = arr.length;
		System.out.println(n);
	}
}