import java.util.Scanner;

public class UppercaseLowercase {

	public static void main(String[] args) {
		char ch,ch2;
		System.out.println("Enter a Character");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			ch2=Character.toLowerCase(ch);
		System.out.println("Lowercase:"+ch2);
		}
		else
		{
			ch2=Character.toUpperCase(ch);
			System.out.println("UpperCase:"+ch2);
		}
	}

}
