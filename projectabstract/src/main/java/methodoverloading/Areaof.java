package methodoverloading;

public class Areaof {
	public static void areag(double r)
	{
		double areac= (int) (3.14*r*r);
		System.out.println("Area of Circle is:::"+areac);
	}
	public static void areag(int b,int h)
	{
		int areat=(b*h)/2;
		System.out.println("Area of Triangle is:::" +areat);
	}
	public static void areag(int a)
	{
		int  areas=a*a;
		System.out.println("Area of Square is::" +areas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
areag(6.0);
areag(3,9);
areag(4);
	}

}
