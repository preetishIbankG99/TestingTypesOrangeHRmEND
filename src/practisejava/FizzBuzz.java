package practisejava;

public class FizzBuzz {

	public static void main(String[] args) {
		for(int i=1;i<50;i++) {
			if(i%3==0&&i%5!=0) {
				System.out.println(i+" fizz ");
				System.out.println();
			}
			if(i%5==0&&i%3!=0 ) {
				System.out.println(i+" buzz ");
				System.out.println();
			}
			if(i%5==0&&i%3==0 ) {
				
				System.out.println(i+" fizzbuzz ");
				System.out.println();
			}

		}

	}

}
