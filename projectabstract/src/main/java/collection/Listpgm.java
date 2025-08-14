package collection;

import java.util.LinkedList;
import java.util.List;

public class Listpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> s=new LinkedList<String>();
s.add("sreeja");
s.add("Suma");
s.add("Bhargavan");
s.add("Java");
System.out.println(s);
System.out.println(s.get(0));
System.out.println(s.get(2));
s.set(2, "Navani");
System.out.println(s);
System.out.println(s.size());
System.out.println(s.isEmpty());
s.remove(1);
System.out.println(s);
System.out.println(s.contains("Java"));
System.out.println(s.contains("suma"));
System.out.println(s.indexOf("Navani"));
s.add("Suma");
System.out.println(s);
System.out.println(s.lastIndexOf("Suma"));
	}

}
