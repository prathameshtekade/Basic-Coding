package Patterns;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many lines you want to print?");
		int n=sc.nextInt();
		
		for(int line=1;line<=n;line++) {
			for(int star=1;star<=line;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
