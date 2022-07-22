//PROGRAM TO CALCULATE SUM OF ODD AND EVEN 
import java.util.Scanner;
public class sumofOddEvennumber {
public static void main(String[]args) {
	int n,sum=0;
	System.out.println("Enter the given range");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	if(n%2==0)
	{
		for(int i=0;i<=n;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("sum of Even Numbers:"+sum);
	}
	else
	{
	for(int i=1;i<=n;i=i+2)	
	{
		sum=sum+i;
	}
	System.out.println("sum of Odd Numbers"+sum);
	}	
}
}
