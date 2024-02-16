package PalindromeOrNot;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int num=1221;
		int rev=0;
		int backup=num;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==backup) {
        System.out.print("Palindrome");
		}
		else {
	    System.out.print("Not Palindrome");

		}

	}

}
