package interviewJavaPrograms;

public class PrintPattern {
	public static void main(String[] args) {
		int rows = 7;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= rows- i + 1 ; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	}

}