package PlaindromeFromString;


public class PlaindromeFromString {

	public static void main(String[] args) {
		String str="madam";
		int length=str.length();
        String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			System.out.println(rev);
	
		
	if(str.equals(rev)) {
		System.out.print("palindrome");
	}
	else {
		System.out.print("Not Palindrome");
	}

	}
}


