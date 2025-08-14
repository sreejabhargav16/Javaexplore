package collection;

import java.util.LinkedList;
import java.util.List;

public class Colctnwithfoeachlop {
public static void main(String[] args) {
	List<String> s=new LinkedList<String>();
	s.add("sreeja");
	s.add("Suma");
	s.add("Bhargavan");
	s.add("Java");
	for(String s1:s)
	{
		System.out.println(s1);
	}
	//System.out.println(s);
	System.out.println(s.get(0));
	System.out.println(s.get(2));
	for(String s1:s)
	{
System.out.println(s1);	
	}
	s.set(2, "Navani");
	for(String s1:s)
	{
		System.out.println(s1);
	}
	System.out.println(s.size());
	for(String s1:s)
	{
		System.out.println(s1);
	}
	System.out.println(s.isEmpty());
	for(String s1:s)
	{
		System.out.println(s1);
	}
	s.remove(1);
	for(String s1:s)
	{
		System.out.println(s1);
	}
}
}

