import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		int a,b,c,sp;
		double Area;
		System.out.println("Enter side lengths of triangle");
Scanner r=new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
c=r.nextInt();
sp=(a+b+c)/2;
Area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
System.out.println("Area of Triangle:"+Area);
}
}
