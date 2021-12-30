package practisejava;

import java.util.Scanner;

public class Test12 {
	public static void main(String[]args){
		//factorial
		/*int i,fact=1;
		int n=5;
		for(i=1;i<=n;i++){
		fact=fact*i;

		}
		System.out.println(fact);*/
		//fibbonaci
		/*int firstnum=0;
		int secondnum=1;
		System.out.print(firstnum+" ");
		System.out.print(secondnum+" ");
		for(int i=0;i<10;i++){
		int thirdnum=firstnum+secondnum;
		System.out.print(thirdnum+" ");
		firstnum=secondnum;
		secondnum=thirdnum;
		}*/
		//for each me
		/*List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hockey");  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.forEach(System.out::println);  */
/*	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String input=sc.nextLine();
	System.out.println("Enter a Particular Character");
	char c=sc.nextLine().charAt(0);
	int count=0;
	for(int i=0;i<input.length();i++) {
		if(c==input.charAt(i)) {
			count++;
			
		}
	}
	System.out.println("Freuency of given character:: "+count);*/
		
		//multiplication table
		/*int a[][]=new int[20][10];
		for(int i=1;i<=20;i++){
			for(int j=1;j<=10;j++){
		a[i-1][j-1]=i*j	;
		System.out.println("  "+a[i-1][j-1]);
		}
		System.out.println();

		}*/
//Reverse a String using Scanner
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String input=sc.nextLine();
		char ch[];
		ch=input.toCharArray();//[g(0),u(1),d(2),u(3)]
		for(int i=input.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);		
		}
	*/

		
		
		
		
	}

}
