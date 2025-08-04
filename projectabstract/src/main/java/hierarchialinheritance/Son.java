package hierarchialinheritance;

public class Son extends Singleparent {
	public void childson()
	{
		System.out.println("Hierarchial Inheritance-son");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son s=new Son();
Son2 d=new Son2();
s.childson();
d.daughter();
s.parent();
d.parent();
	}

}
