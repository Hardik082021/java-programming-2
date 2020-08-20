
public class Staticmethod {
	
	static int a=4;
	static int b=45;
	 static void p()
	{
		System.out.println(a+" "+b);
	}
	static {
		System.out.println("when the program run all static statemnet are executed firs t");
	}
	public static void main(String args[])
	{
		p();
	}
}
