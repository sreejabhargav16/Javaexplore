package aggretn;

public class Second {
int i,j;
Aggretn p;//aggregation
Second(int i,int j,Aggretn p)
{
	this.i=i;
	this.j=j;
	this.p=p;
}
public void display()
{
	System.out.println(i);
	System.out.println(j);
	System.out.println(p.a);
	System.out.println(p.d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aggretn t=new Aggretn(5,9);
Second s=new Second(7,8,t);
s.display();
	}

}
