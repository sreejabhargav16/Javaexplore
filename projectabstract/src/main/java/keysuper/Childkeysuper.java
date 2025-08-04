package keysuper;

public class Childkeysuper extends Keysuper1 {
int i=20;
public void display()
{
	System.out.println(super.i);
	System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childkeysuper c=new Childkeysuper();
c.display();
	}

}
