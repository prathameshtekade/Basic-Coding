package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter A String");
		 String s = sc.next();
		// String s = sc.next().toLowerCase();

		 StringBuffer sb = new StringBuffer(s);
		 
		 sb.reverse();
		 
		 String rev_s = sb.toString();
	//	 if(s.equalsIgnoreCase(rev_s)) {
		 if(s.equals(rev_s)) {
			 System.out.println("It is a Palindrome");
		 }else {
			 System.out.println("It is not a Palindrome");
		 }
		 

	}

}