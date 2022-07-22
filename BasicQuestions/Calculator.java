import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int n1,n2,ch,calc;
		System.out.println("Enter Two Numbers");
		Scanner r=new Scanner(System.in);
		n1=r.nextInt();
		n2=r.nextInt();
		System.out.println("Press 1 for Addition"+"Press 2 for Subtraction"+"Press 3 for Multiplication "+"Press 4 for division"+"Press 5 for Remainder" );
		Scanner r1=new Scanner(System.in);
		ch=r1.nextInt();
		if(ch==1)
		{
			calc=n1+n2;
			System.out.println("Addition:"+calc);
		}
		else if(ch==2)
		{
			calc=n1-n2;
			System.out.println("Subtraction:"+calc);
		}
		else if(ch==3)
		{
			calc=n1*n2;
			System.out.println("Multiplication:"+calc);
		}
		else if(ch==4)
		{
			calc=n1/n2;
			System.out.println("Division"+calc);
		}
		else if(ch==5)
		{
			calc=n1%n2;
			System.out.println("Remainder"+calc);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
