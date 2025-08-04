package biostudent;

public class Studentaddress {
	public void address(String address)
	{
		System.out.println("The address of the student is " +address);
	}
public static void main(String[] args) {
	Student s=new Student();
	Studentaddress a=new Studentaddress();
	s.studentbio("Sreeja",12);
	a.address("House,Alappuzha");
}
}
