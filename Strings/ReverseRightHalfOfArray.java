package Strings;

import java.util.Scanner;

public class ReverseRightHalfOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter A String");
		String s=sc.next();
		char[] ch=s.toCharArray();
		int n=s.length();
		System.out.println(n);
		for(int i=0;i<n/2;i++)
		{
			System.out.print(ch[i]);
		}
		
	for(int j=n-1;j>n/2;j--)	
	{
		System.out.print(ch[j]);
	}
	System.out.println();
	}
}
