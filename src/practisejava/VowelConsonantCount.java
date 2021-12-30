package practisejava;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String s="This Is What I am";
		int vCount=0;
		int cCount=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vCount++;
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				cCount++;
			}
		
		}

	System.out.println("Number of Vowels " +vCount);
	System.out.println("Number of Consonants " +cCount);
	
	}

}
