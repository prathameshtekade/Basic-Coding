import java.util.Scanner;

public class printingfactorial {

	public static void main(String[] args) {
		int n,fact=1,a;
		System.out.println("Enter a Number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<=n;i++)
		{
			a=n-i;
			System.out.print("Factorial:"+a+" ");
			fact=fact*i;
			
		}
		System.out.println("Factorial of a Number is:"+fact);

	}

}
