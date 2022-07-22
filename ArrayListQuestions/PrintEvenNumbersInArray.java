package ArrayAndArraylist;

import java.util.Scanner;

public class PrintEvenNumbersInArray {

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
					if(array[index]%2 == 0){ 
			            System.out.println(array[index]);
					}
//					System.out.println(index+"->"+array[index]);
				}
//				System.out.println("Printing using for each loop");
//				for(int elmt:array) {
//					if(elmt%2==0){
//				System.out.println(elmt+"is even");
//	}
//	else {
//		System.out.println("Odd");
//	}
	
//					System.out.println(elmt);
//				}
			}

	}
/*package LinkedList;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// Arrays -> store same kind of values and size is fixed
		//collection of numbers -> int
		//1. I need to know about the size
		
		Scanner sc  = new Scanner(System.in);	
		System.out.println(" enter size: ");
		int size = sc.nextInt();
		
		// 2. declare the array with the given size
		
		int[] array = new int[size];
		
		// 3. I need to get the values form the user
		// index 0 -> n-1 -> array[index] = sc.nextInt()
		System.out.println("enter " + size + " values: ");
		for (int index = 0; index < size ; index++) {
			array[index] = sc.nextInt();
		}
		
		//4. printing the values
		System.out.println("Printing using for loop");
		for (int index = 0; index < size ; index++) {
			System.out.println(index + " -> "+ array[index]);
		}

		System.out.println("Printing using for each loop");
		for (int elmt : array) {
			System.out.println(elmt);
		}
		
		System.out.println("Priniting the elements in the even index");
		for (int index = 0; index < size; index = index+ 2) {
			System.out.println(array[index]);
		}
		
		System.out.println("Priniting the elements in the odd index");
		for (int index = 1; index < size; index = index+ 2) {
			System.out.println(array[index]);
		}
		

		System.out.println("Printing the even numbers in the array");
		for (int elmt : array) {
			if (elmt % 2 == 0)
			System.out.println(elmt);
		}
		
		System.out.println("Printing the odd numbers in the array");
		for (int elmt : array) {
			if (elmt % 2 != 0)
			System.out.println(elmt);
		}
	}

}*/
