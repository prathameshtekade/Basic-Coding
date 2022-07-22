import java.util.Scanner;
public class AreaofRectangle {
	public static void main(String[] args) {
		int Area,l,b;
		System.out.println("Enter length & breadth");
Scanner r=new Scanner(System.in);
l=r.nextInt();
b=r.nextInt();
Area=l*b;
System.out.println("Area of Rectangle is:"+Area);
}
}
