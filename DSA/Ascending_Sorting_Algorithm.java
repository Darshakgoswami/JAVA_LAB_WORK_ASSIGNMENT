// tim sort algorithm is combination of merge sort and insertion sort
// it is used in designing to perform real world data sorting
// it is used stable sorting algorithm
// it is used to define the natural ordering of objects
// it is the default sorting algorithm in java's Array.sort() method
// the compareTo() method is used to compare two objects of the same class
// it is designed to perform well on many kinds of real world data

package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Admin_Sorting_class implements Comparable<Admin_Sorting_class>
{
	int id;
	String name;
	public Admin_Sorting_class(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

@Override
public int compareTo(Admin_Sorting_class o) {
	// TODO Auto-generated method stub
	/*if(id==o.id)
	{
	return 0;
	}
	else if(id>o.id)
	{
		return 1;
	}
	else
	{
		
		return -1;
	}
	*/
	return Integer.compare(this.id,o.id);
}
}

public class Ascending_Sorting_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<Admin_Sorting_class> al = new ArrayList<Admin_Sorting_class>();
		al.add(new Admin_Sorting_class(4, "test4"));
		al.add(new Admin_Sorting_class(7, "test7"));
		al.add(new Admin_Sorting_class(0, "test0"));
		al.add(new Admin_Sorting_class(5, "test5"));
		al.add(new Admin_Sorting_class(2, "test2"));
		al.add(new Admin_Sorting_class(9, "test9"));
		
		Collections.sort(al);
		Iterator<Admin_Sorting_class> it = al.iterator();
		while(it.hasNext())
		{
			Admin_Sorting_class a = it.next();
			System.out.println(a.id+" "+a.name);
		}
}
}
