package Recursion;

import java.util.Scanner;

public class FindingPowerValueUsingRecursion {
		static int res=0,ans;
		static int power(int a,int b) {
			if(b==0) {
				return 1;
			}
			if(b%2==0) {
		    ans=power(a,b/2);
		    res=ans*ans ;
		    return res;
		    }
			else {
				ans=power(a,b/2);
				  res=a*ans*ans;
				  return res;
			}
		}
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int p=power(a,b);
			System.out.println(p);
	}

}
