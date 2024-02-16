package PrintFactorial;

public class PrintFactorial {

	public static void main(String[] args) {
		int num=5;
		int fact=0;
		for (int i=0;i<=num;i++) {
			fact=fact+num*(num-1);
		}
			System.out.print(fact);
					
		
		
	}

}
