package assign8;

public class HDFC implements RBI{
public double recurringDeposit(double amount,double durtn)
{
	System.out.println("The amount Depositer get");
	double ainvest=amount*12;
	double dumnth=durtn/12.0;
	double mamnt=amount*durtn+(amount*durtn*irate*dumnth);
	System.out.println(mamnt);
	return mamnt ;
}
public static void main(String[] args) {
RBI r=new HDFC();
r.recurringDeposit(10000,5);

}
}

