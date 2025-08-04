package checkaddition;

public class Checkaddnum extends Checkadd{
public void checknum(int a,int b)
{

int sum=super.addnum(20,30);	
System.out.println("The SUM is"+sum);
if(sum%10==0)
{
System.out.println("The sum is divisible by 10");	
}
else
{
System.out.println("The sum is not divisible by 10");	
}
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
Checkaddnum c=new Checkaddnum();
c.checknum(20,30);
	}

}
