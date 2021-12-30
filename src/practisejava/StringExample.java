package practisejava;

import java.util.Scanner;

public class StringExample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String Name");
	String input=sc.nextLine();
	String s[]=input.split("\\s");
   
    for(String w:s) {
    	//System.out.println(w);
    	if(w.equalsIgnoreCase("Kumar")) {
    		System.out.println(w);
    		break;
    		
   	}
    	
   
	
	
}
}}
