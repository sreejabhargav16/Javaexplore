package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Pgmiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l=new LinkedList<String>();
l.add("sreeja");
l.add("Suma");
l.add("Bhargavan");
Iterator<String> i=l.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
i.remove();
System.out.println(l);
	}

}
