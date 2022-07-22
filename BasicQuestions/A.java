
public class A {
	int a=10;String name;
	A()
	{
		a=0;name=null;
	}
	void show()
	{
	System.out.println(a+" "+name);	
	}
	}
class B{
	public static void main(String[] args) {
		A ref=new A();
		ref.show();
	}
}
