package ArrayAndArraylist;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter "+size+" Value:");
		for(int index=0;index<size;index++) {
			array[index]=sc.nextInt();
		}
		System.out.println("Printing using for loop");
		for(int index=0;index<size;index++) {
			System.out.println(index+"->"+array[index]);
		}
		System.out.println("Printing using for each loop");
		for(int elmt:array) {
			System.out.println(elmt);
		}
	}
}
