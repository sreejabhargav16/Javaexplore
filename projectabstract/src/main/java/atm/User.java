package atm;

public class User {

	private int pin;
	private String name;
	private double balance;
	public void set(String name,int pin ,double balance)
	{
		this.name=name;
		this.pin=pin;
		this.balance=balance;
	}
	public int getpin()
	{
		return pin;
	}
	public String getname()
	{
		return name;
	}
	public double getbalance()
	{
		return balance;
	}
	

		
	}

