//Printing Assci value
import java.util.Scanner;

public class printAsciivalue {

	public static void main(String[] args) {
		char ch;
	System.out.println("Enter a chracter");
Scanner r=new Scanner(System.in);
ch=r.next().charAt(0);
int a=ch;
System.out.println("Assci value of"+" "+ch+" "+"is"+" "+a);
	}
}