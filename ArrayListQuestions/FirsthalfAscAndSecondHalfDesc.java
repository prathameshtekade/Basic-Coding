package ArrayAndArraylist;
import java.util.Arrays;
import java.util.Scanner;

public class FirsthalfAscAndSecondHalfDesc {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int index=0;index<n;index++)
{
	a[index]=sc.nextInt();
}
Arrays.sort(a);
// printing first half in ascending
// order
for (int i = 0; i < n / 2; i++) {
	System.out.print(a[i]+" ");
}

// printing second half in descending
// order
for (int j = n-1; j >= n / 2; j--)
System.out.print(a[j]+" ");

	}
}
