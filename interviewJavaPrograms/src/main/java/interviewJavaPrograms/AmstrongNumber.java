package interviewJavaPrograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num = 23;
		int backup = num;
		int sum = 0;

		while (num > 0) {
			sum = sum + (num % 10) * (num % 10) * (num % 10);
			num = num / 10;
		}
		if (sum == backup) {
			System.out.println("Amstrong Number");
		} else {
			System.out.println("Not Amstrong Number");
		}
	}

}
