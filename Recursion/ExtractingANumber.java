package Recursion;

import java.util.Scanner;

public class ExtractingANumber {
	static void extract(int n,String[] arr) {
		 if(n==0) {
			 return;
		 }
		int digit=n%10;
		 n=n/10;
			System.out.print(arr[digit]+" ");
System.out.println();
		extract(n,arr);
		System.out.print(arr[digit]+" ");
//		return arr[digit];	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		int n=sc.nextInt();
		extract(n,arr);
	}

}
