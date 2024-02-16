package CountStringCharacter;


public class CountStringCharacter {

	public static void main(String[] args) {
		String str="Hello World";
		int count=0;
		int length=str.length();
		for(int i=0;i<length;i++) {
			if(str.charAt(i)!=' ') {
				count++;

			}
		}
		System.out.print(count);

	}
}
			

	


