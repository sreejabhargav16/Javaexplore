package multipleinheritance;

public class Multipleinheritchild implements Multipleparent,Multipleparent1 {
public void meth()
{
System.out.println("Multiple inheritance Parent1");	
}
public void display()
{
	System.out.println("Multiple inheritance Parent");
}
public void childmeth(){
	
	System.out.println("Multiple inheritance childclass");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multipleinheritchild m=new Multipleinheritchild();//multiple inheritance only object calling abstraction is there
m.meth();
m.display();
m.childmeth();
	}

}
