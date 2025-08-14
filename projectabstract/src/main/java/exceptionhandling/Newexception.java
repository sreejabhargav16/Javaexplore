package exceptionhandling;

public class Newexception {

	public static void main(String[] args)throws VotingException {//throws declare
		// TODO Auto-generated method stub
		int age=10;
		if( age>=18)
		{
			System.out.println("Qualified forVoting ");
		}
		else
		{
			throw new VotingException("Age is under 18"); 
		}
	}

}
