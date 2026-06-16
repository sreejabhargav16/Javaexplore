package assign8;

public  class FullTimeEmployee extends Employee{
	public void calculateSalary(int salary)
	{
		int totalsal=salary*8;
		System.out.println("Totalsalry of FullEmployee is"+totalsal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee e=new FullTimeEmployee();
	Employee c=new Contractor();
	e.calculateSalary(10000);
	c.calculateSalary(1000);

	}

}
