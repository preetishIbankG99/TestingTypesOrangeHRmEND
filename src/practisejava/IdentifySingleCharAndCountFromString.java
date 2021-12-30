package practisejava;

public class IdentifySingleCharAndCountFromString {
	public static char ch;
	public static void main(String[] args) {
		String s="mmoonnooppooqqoo";
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch=='o') {
				count++;
			}
			
		}
		System.out.println("TOTAL NUMBER OF:: "+ ch +" is " +count);
		
	}

}
 