import java.util.Scanner;
public class TaxCalculation {

	public static void main(String[] args) {
		 int sal;
		 double tax;
		 System.out.println("Enter salary");
Scanner r=new Scanner(System.in);
sal=r.nextInt();
if(sal<10000)
{
	System.out.println("No Tax");
}
else if(sal>10000&&sal<100000)
{
	tax=sal*0.1;
	System.out.println("10% Tax="+tax);
}
else
{
	tax=sal*0.2;
			System.out.println("20% Tax="+tax);
	
}
}

}
