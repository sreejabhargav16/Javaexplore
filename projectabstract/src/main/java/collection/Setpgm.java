package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		Set<String>s1=new TreeSet<String>();
		s.add("Grapes");
		s.add("Apple");
		s.add("Orange");
		s1.add("Ernakulam");
		s1.add("Alappuzha");
		s1.add("Pathanamthitta");
		System.out.println(s);
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.size());
		System.out.println(s1.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains("Apple"));
		System.out.println(s1.contains("Sreeja"));
		System.out.println(s1.containsAll(s));
		System.out.println(s.containsAll(s1));
		s.remove("Orange");
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		s.clear();
		System.out.println(s);
	
		
	}

}
