package practisejava;



public class Ex1 {

	public static void main(String[] args) {
	String s="MMNNOONNPPOOHHOO";
	char c=s.charAt(4);
int count=0;
for(char z:s.toCharArray()) {
	if(z==c) {
		count++;
	}
}
System.out.println(c + " occurs " + count + " times in " + s);


	}

	}


