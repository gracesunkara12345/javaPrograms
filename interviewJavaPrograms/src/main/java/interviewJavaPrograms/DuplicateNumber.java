package interviewJavaPrograms;

public class DuplicateNumber {

	public static void main(String[] args) {
		int n[] = {1,2,3,4,6,7,2,3,4};
		for(int i=0; i<n.length; i++) {
			for(int j=i+1; j<n.length-1; j++) {
				if(n[i]==n[j]) {
					System.out.println(n[j]);
				}
			}
		}
	}

}
