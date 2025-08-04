package Employee;

public class Employcalc extends Employbasic {
	double hra,pf;
public void employcalc()
{
	this.hra=hra;
	this.pf=pf;
	 hra=bpay*0.05;
	 pf=bpay*0.2;
System.out.println("HRA "+hra);
System.out.println("PF  "+pf);

}
}
