package assign8;

public  class Contractor extends Employee {
	
public void calculateSalary(int salary)
{
	int pay=10;
	int wh=3;
	System.out.println("Contractor salary");
	int totalsal=(int)(salary*pay*wh);
	System.out.println("Total salaryis" +totalsal);
}
}
