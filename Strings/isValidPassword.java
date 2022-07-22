package Strings;

import java.util.Scanner;

public class isValidPassword {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		password=r.next();
		System.out.println("Enter a password");
		
		int lowercase=0;
		int uppercase=0;
		int digits=0;
		int splchars=0;
		for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uppercase++;
			else if(){
				
			}
			}
		}
	}

}
