package collection;

import java.util.HashSet;
import java.util.Set;

public class Setpgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		Set<String> c=new HashSet<String>();
		s.add("Apple");
		s.add("Orange");
		c.add("Alappuzha");
		c.add("Pathanamthitta");
		System.out.println(s);
		System.out.println(c);
		System.out.println(s.contains("Orange"));
		System.out.println(c.contains("Ernakulam"));

	}

}
