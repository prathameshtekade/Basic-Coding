import java.util.Scanner;
public class swapwithoutusingthreevariable {

	public static void main(String[] args) {
		int a,b;
		System.out.println("String before swapping");
Scanner r=new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
System.out.println("String before swapping"+ a+" "+b);
a=a+b;//a=100+200=300
b=a-b;//b=300-200=100
a=a-b;//a=300-100=200
System.out.println("After Swapping"+ a+" "+b);
	}
	}

