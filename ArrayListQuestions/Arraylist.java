package ArrayAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			ArrayList <Integer> al = new ArrayList<>();
			for(int i=0;i<n;i++)
			{
//			al.add(23);
//			al.add(56);
//			al.add(57);
			al.add(sc.nextInt());
			}
			
			for (Integer i : al) {
				System.out.println(i);
			}
			System.out.println(al.size());

			
			for (int i = 0 ; i < al.size(); i++) {
				System.out.println(i + " -> " + al.get(i));//arr[i]
			}
			al.add(0,22);
			al.remove(4);
			for (int i = 0 ; i < al.size(); i++) {
				System.out.println(i + " -> " + al.get(i));//arr[i]
			}
		}

	}
  