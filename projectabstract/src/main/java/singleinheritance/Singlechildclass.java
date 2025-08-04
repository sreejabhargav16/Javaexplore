package singleinheritance;

public class Singlechildclass extends Parentclass {
	
public void Child()
{
System.out.println("Single Inheritance-Child class");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singlechildclass c=new Singlechildclass();
c.Child();
c.parent();
	}

}
