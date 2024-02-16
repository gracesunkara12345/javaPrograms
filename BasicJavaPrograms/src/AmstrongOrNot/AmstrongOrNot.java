package AmstrongOrNot;


public class AmstrongOrNot {

	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int backup=num;
		while(num>0) {
			sum=sum+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(sum==backup) {
			
			System.out.print("Amstrong");

		}
		else {
			System.out.print("Not Amstrong");

		}

	}

}
