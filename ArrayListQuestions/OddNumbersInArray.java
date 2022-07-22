package ArrayAndArraylist;

import java.util.Scanner;

public class OddNumbersInArray {

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
			if(array[index]%2!= 0){ 
	            System.out.println(array[index]);
			}
			
		}
	}

}
