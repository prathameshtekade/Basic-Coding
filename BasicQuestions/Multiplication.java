import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		int n,table;
		System.out.println("Enter a Number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<=10;i++)
		{
			table=n*i;
			System.out.println(n+"*"+i+"="+table);
		}
		}

}
