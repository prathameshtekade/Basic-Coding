import java.util.Scanner;

public class SwappingofNumbers {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("String before swapping");
Scanner r=new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
System.out.println("String before swapping"+ a+" "+b);
temp=a;
a=b;
b=temp;
System.out.println("After Swapping"+ a+" "+b);
	}

}
