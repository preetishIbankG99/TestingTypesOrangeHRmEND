package practisejava;

import java.util.Scanner;

public class FrequencyOfString {

	public static void main(String[] args) {
	
	/*String s="Preetish Kumar Bhanjadeo";
	int count =0;
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)=='e') {
			count++;
		}
	}
	System.out.println("Frequency of char is :: "+count);*/
	

	System.out.println("Enter a string value::");

	Scanner sc=new Scanner(System.in);

	String str=sc.nextLine();


	System.out.println("Enter a particular character:::");
	char ch=sc.nextLine().charAt(0);
	int count=0;

	for(int i=0;i<str.length();i++){
	if(ch==str.charAt(i)){
	count++;

	
	}
}
	System.out.println("Freuency of given character:: "+count);
	}}
