import java.util.Scanner;
public class printCharacter {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a character");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(2);
		System.out.println(ch);
	}

}
