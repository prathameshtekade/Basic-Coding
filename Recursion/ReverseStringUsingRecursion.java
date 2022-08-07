package Recursion;

public class ReverseStringUsingRecursion {
    static String reverse(String str,int i,int j) {
    	if(i>j) {
    		return str;
    	}
    swap(str.charAt(i),str.charAt(j));
    i++;
    j--; 
    
    return reverse(str,i,j);
    }
	private static void swap(char i, char j) {
		char temp;
		temp=i;
		i=j;
		j=temp;
	}
	public static void main(String[] args) {
		String str="Prathamesh";
		int i=0;
		int j=str.length()-1;
		System.out.println(reverse(str,i,j));
	}

}
