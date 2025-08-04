package polymorphism;

public class Childcl extends Runtimemorphism {
	public void parentcl()//method overriding
	{
		super.parentcl();//to call Parentclass method

		System.out.println("Runtime Polymorphism in Childclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childcl c=new Childcl();
c.parentcl();
Runtimemorphism r=new Childcl();//upcasting
r.parentcl();
	}

}
