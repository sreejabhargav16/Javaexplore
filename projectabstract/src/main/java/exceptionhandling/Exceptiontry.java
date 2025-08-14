package exceptionhandling;

public class Exceptiontry {

	public static void main(String[] args) {

// TODO Auto-generated method stub
		try
		{
int a=20/0;
System.out.println("Result is"+a);
}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("Hello World");
		}
	}

}
