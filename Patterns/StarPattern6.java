package Patterns;

import java.util.Scanner;

public class StarPattern6 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("How many lines you want to print?");
			int n=sc.nextInt();
			int even=2;
			for(int line=1;line<=n;line++) {
				for(int star=1;star<=even;star++) {
					System.out.print("*");
				}
				even=even+2;
				System.out.println();
			}
		}
}
