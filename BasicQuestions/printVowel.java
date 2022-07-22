//PRINTING THE CHARACTER IS VOWEL OR CONSONANT
import java.util.Scanner;
public class printVowel {

	public static void main(String[] args) {
			char ch;
			System.out.println("Enter a character");
			Scanner r=new Scanner(System.in);
			ch=r.next().toLowerCase().charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("This is vowel");
			}
			else 
			{
			System.out.println("This is consonent");
			}
			}
	}


