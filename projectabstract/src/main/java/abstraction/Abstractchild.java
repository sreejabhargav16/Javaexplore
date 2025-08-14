package abstraction;

public class Abstractchild extends Abstractpgm {
	public void meth()
	{
		System.out.println("Abstract method overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstractpgm pgm=new Abstractchild();
pgm.meth();
pgm.display();
	}

}
