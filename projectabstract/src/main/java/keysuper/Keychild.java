package keysuper;

public class Keychild extends Keyparent{
	public void display()
	{
		System.out.println("Keyword super childclass");
	}
public void meth()
{
super.display();//parent method
display();//child method
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Keychild k=new Keychild();
k.meth();
	}

}
