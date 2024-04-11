package interviewJavaPrograms;

public class SeperationZeroAndNum {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 0, 5, 7, 0, 0, 4, 0, 5 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");

		}
	}
}
