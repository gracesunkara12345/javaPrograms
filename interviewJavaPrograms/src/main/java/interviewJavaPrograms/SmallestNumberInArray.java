package interviewJavaPrograms;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int[] num = { 1, 4, 5, 6, 9 };
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
		}
		System.out.println(min);
	}
}