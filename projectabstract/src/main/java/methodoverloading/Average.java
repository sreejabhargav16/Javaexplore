package methodoverloading;

public class Average {
	public static void avg(int a,int b,int c)
	{
		int ag=(a+b+c)/3;
	
		System.out.println("The Average Of three Integer Number is"+ag);
	}
	public static void avg(float i,float j,float k)
	{
		float fag=(i+j+k)/3;
	
		System.out.println("The Average Of three Integer Number is"+fag);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
avg(5,9,7);
avg(6.1f,5.6f,6.3f);
	}

}
