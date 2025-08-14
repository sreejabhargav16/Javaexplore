package exceptionhandling;

public class Exceptionthrowpgm {
public static void main(String[] args) {
	int age=10;
	if( age>=18)
	{
		System.out.println("Qualified forVoting ");
	}
	else
	{
		throw new ArithmeticException("Age is under 18!!");
	}
}
}
