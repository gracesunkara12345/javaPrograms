package SumOfNumbers;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.print(rev);


	}

}