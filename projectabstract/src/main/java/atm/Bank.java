package atm;

public class Bank {
public void setpin(User user,int newpin)
{
	//pin=newpin;
	System.out.println("The pin is Updated");
}
public boolean validatepin(User user,int epin)
{
	return user.getpin()==epin;
	}
}
