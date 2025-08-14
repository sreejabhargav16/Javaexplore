package exceptionhandling;

public class Multiplecatchexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
int a[]= new int[10];
a[10]=15/0;

}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Arrayindexexception occurs");	
}
catch( ArithmeticException a)
{
System.out.println("Arithmetic Exception Occurs");	
}
catch(Exception e)
{
System.out.println("Other Exception");	
}
	
	}

}
