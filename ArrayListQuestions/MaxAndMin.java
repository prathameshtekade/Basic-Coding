package ArrayAndArraylist;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter "+size+" Value:");
		for(int index=0;index<size;index++) {
			array[index]=sc.nextInt();
		}
		int min=array[0];
		for(int i=1;i<size;i++) {
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		int max=array[0];
		for(int i=1;i<size;i++) {
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("min ->"+min);
		System.out.println("max ->"+max);
	}

}
