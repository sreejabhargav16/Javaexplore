package exam;

public class Add {
	int a,b,c;
 public void add(int a,int b)
	{

	 this.a=a;
	 this.b=b;
	 c=a+b;
	 System.out.println("The sum is"+c);
 }
	
	public void avg()
	{
	
		float avg=(c)/2;
		System.out.println("The average is"+avg);
	}
	public static void main(String[] args) {
		Add a=new Add();
		a.add(8, 5);
		a.avg();
	}

}
