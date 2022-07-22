import java.util.Scanner;
//Dynamic Array Creation
public class DynamicArray {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter Size of Array");
		Scanner r=new Scanner(System.in);
size=r.nextInt();
int a[]=new int[size];
for(int i1=0;i1<size;i1++)
{
	a[i1]=r.nextInt();
}
	System.out.println("Print Array Elements ");
	for(int i1=0;i1<size;i1++)
	{
		System.out.print(a[i1]+" ");
	}
	}
}
