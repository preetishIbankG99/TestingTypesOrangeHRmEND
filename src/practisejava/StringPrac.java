package practisejava;

public class StringPrac {

	public static void main(String[] args) {
		String s="JAVATPOINT";
		int count=0;
		System.out.println(s.length());
		int len=s.length();
		//charAt()
		char c=s.charAt(5);
		System.out.println(c);
System.out.println(s.charAt(len-1));
//print char present in even postion
for(int i=0;i<s.length()-1;i++) {
	if(i%2==0) {
		System.out.println("Char at " +i+ " place "+s.charAt(i));
	}
if(s.charAt(i)=='A') {
	count++;
}

}
	System.out.println("Frequency of A is:"+count);
	}

}
