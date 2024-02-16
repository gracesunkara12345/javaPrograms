package VowelOfString;

public class VowelfromString {

	public static void main(String[] args) {
		String result="dmndjdfjkdeio";
		StringBuffer sb= new StringBuffer();
		for (int i=0;i<result.length();i++) {
			if(result.charAt(i)=='a'||result.charAt(i)=='e'||result.charAt(i)=='i'||result.charAt(i)=='o'
					||result.charAt(i)=='u'||result.charAt(i)=='A'||result.charAt(i)=='E'
					||result.charAt(i)=='I'||result.charAt(i)=='O'||result.charAt(i)=='U') {
				sb.append(result.charAt(i));
			}
		}
				System.out.println(sb);
			}
	
		}

	


 