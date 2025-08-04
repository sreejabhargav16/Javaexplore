package Employee;

public class Employbasic {
	int bpay,deduct,bonus;
	public void employget(int bpay,int deduct,int bonus)
	{
		this.bpay=bpay;
		this.deduct=deduct;
		this.bonus=bonus;
		System.out.println("Employee basic details");
		System.out.println("Basic pay is::"+bpay);
		System.out.println("Deduction is ::"+deduct);
		System.out.println("Bonus  is::"+bonus);
	}

}
