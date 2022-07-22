package Strings;

import java.util.Scanner;

public class FindingNumberInAString {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter A String");
String s=sc.next();
char[] ch=s.toCharArray();
StringBuilder sb=new StringBuilder();

for(char c:ch)
{
	if(Character.isDigit(c))
	{
		sb.append(c);
	}
}
System.out.println(sb);
}
}