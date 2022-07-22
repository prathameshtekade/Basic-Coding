import java.util.Scanner;
public class ArrayInReverseorder {

	public static void main(String[] args) {
	int a[]=new int[5];
	System.out.println("Enter array Elements");
	Scanner r=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		a[i]=r.nextInt();
	}
for(int i=0;i<5;i++)
{
	System.out.println("Array Elements are"+a[i]+" ");
}
for(int i=5-1;i>=0;i--) 
{
	System.out.println("Reverse order of Elements"+a[i]+" ");
}
	}

}
