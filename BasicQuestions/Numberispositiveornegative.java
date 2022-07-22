import java.util.Scanner;

public class Numberispositiveornegative {
public static void main(String[] args) {
	int n;
	System.out.println("Enter a value");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	if(n>0)
	{
		System.out.println("Number is Positive");
	}
	else if(n<0)
	{
		System.out.println("Number is Negative");
	}
	else
	{
		System.out.println("Number is Neither Positive nor negative");
	}
}
}
