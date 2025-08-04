package customerdiscount;

public class Offseason {
	public void discount(int totalamt)
	{
		int disc=(totalamt*15)/100;
		System.out.println("The Discounted amount on Offseason" +disc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Onseason obj=new Onseason();
obj.discount(10000);
Offseason os=new Offseason();
os.discount(15000);
	}

}
