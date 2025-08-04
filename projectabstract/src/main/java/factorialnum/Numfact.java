package factorialnum;

public class Numfact {
int fact=1;
public int calcultefact(int num)
{
	for(int i=1;i<=num;i++)
	{
	fact=fact*i;
	}
	return fact;
	}
public void print(int num)
{
int result=calcultefact(num);
System.out.println("The Factorial Of the number is  "+result);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numfact n=new Numfact(); 
        n.print(5);
	}

}
