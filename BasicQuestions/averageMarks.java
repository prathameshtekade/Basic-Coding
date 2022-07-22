import java.util.Scanner;
public class averageMarks {

	public static void main(String[] args) {
		int English,Marathi,Hindi,Maths,Science,sum;
		double avg;
		System.out.println("Enter Marks");
Scanner r=new Scanner(System.in);
English=r.nextInt();
Marathi=r.nextInt();
Hindi=r.nextInt();
Maths=r.nextInt();
Science=r.nextInt();
//sum=English+Marathi+Hindi+Maths+Science;
avg=English+Marathi+Hindi+Maths+Science/5;
System.out.println(" Marks:"+avg);
	}

}
