package reverseno;

public class Numberreverse {
	int num,rev;
	Numberreverse(int num)
	{
		this.num=num;
		while(num!=0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		
	}
	
		Numberreverse()
		{
			this(12345);
			System.out.println("The reversed number is " +rev);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberreverse n=new Numberreverse();

	}

}
