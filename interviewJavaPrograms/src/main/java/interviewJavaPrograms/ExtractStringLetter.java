package interviewJavaPrograms;

public class ExtractStringLetter {
	public static void main(String[] args) {
		String str = "hellooelooo?";
		char ch1[] = str.toCharArray();

		for (int i = 0; i < ch1.length - 1; i++) {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (ch == ch1[i] & ch == 'e')
					System.out.println(ch + " ");}}
		int n = str.length();
		System.out.println("Length of the String : " + n);}}
