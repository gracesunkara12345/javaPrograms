package DuplicateArray;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[]= new int[] {1,2,3,4,3,1,2,4};
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				
		
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
			}
		}

	}

}
