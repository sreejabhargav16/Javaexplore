package grade;

public class Candidate {
	int m1,m2,m3;
	 Candidate(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public int getotalmarks()
	{
		return m1+m2+m3;
	}
public static char calculategrade(int totalmarks)
{
if(totalmarks>=270)
{
return 'A';	
}
else if(totalmarks>=230)
{
return 'B';	
}
else if(totalmarks>=180)
{
return 'C';	
}
else if(totalmarks>=100)
{
return 'D';	
}
else
{
return 'F';	
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Candidate c1=new Candidate(75,80,65);
Candidate c2=new Candidate(60,65,50);
int totalmark1=c1.getotalmarks();
int totalmark2=c2.getotalmarks();
char grade1=calculategrade(totalmark1);
System.out.println("Candidate1 Grade is :"+grade1);

char grade2=calculategrade(totalmark2);
System.out.println("Candidate2 Grade is :"+grade2);
	}

}
