package multilevelinheritance;

public class Firstgenclass extends Secondgenclass {
	public void son()
	{
		System.out.println("Multilevel Inheritance-Firstgenclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Firstgenclass f=new Firstgenclass();
f.son();
f.Fath();
f.grand();
	}

}
