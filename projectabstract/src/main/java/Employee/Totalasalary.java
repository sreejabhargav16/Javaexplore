package Employee;

public class Totalasalary extends Employcalc {
	public void salaryslip()
	{
	
		double totalsalary=(bpay+hra+bonus-deduct-pf);
		System.out.println("Total salaryis:"+totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Totalasalary e=new Totalasalary();
e.employget(10000,500,1500);
e.employcalc();
e.salaryslip();
	}

}
