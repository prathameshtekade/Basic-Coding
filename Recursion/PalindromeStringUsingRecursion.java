package Recursion;

public class PalindromeStringUsingRecursion {
	static boolean palin(String str,int i,int j) {
		if(i>=j) {
			return true;
		}
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		return palin(str,i+1,j-1);
	}
	public static void main(String[] args) {
		String str="sos";
		int i=0;
		int j=str.length()-1;
		boolean checkpalin=palin(str,i,j);
		if(checkpalin) {
		System.out.println("Is Palindrome"); 
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
