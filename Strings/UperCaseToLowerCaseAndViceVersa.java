package Strings;

import java.util.Scanner;

public class UperCaseToLowerCaseAndViceVersa {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				String input = sc.next();
				
				System.out.println("Length = " + input.length());
				
				for (int i = 0 ; i < input.length(); i++) {
				   char c = input.charAt(i);
				   if (Character.isLowerCase(c)) {
					   System.out.print(Character.toUpperCase(c));
				   }
				   else if (Character.isUpperCase(c)) {
					   System.out.print(Character.toLowerCase(c));
				   }
	}

	}
}
