import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		int r;
		double Area;
		final double PI=3.14;
		System.out.println("Enter radius of circle:");
Scanner a=new Scanner(System.in);
r=a.nextInt();
Area=PI*r*r;
System.out.println("Area of Circle:"+Area);
	}

}
