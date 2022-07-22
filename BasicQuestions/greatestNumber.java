import java.util.Scanner;
public class greatestNumber {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two Numbers");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
	}

}
