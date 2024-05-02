package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Listexam 
{
	public static void main(String args[])
	{
		List <String> s= new ArrayList<String>();  
		s.add("Seeta");
		s.add("Chinj");
		s.add("Anvi");
		s.add("Allen");
		s.add("Sharon");
		s.add("Allen");
		
		System.out.println(s);
		// set the values;
       s.set(0, "alle");
       System.out.println(s);
       // indexof value of Allen =3 first index finding ;
       int index=s.indexOf("Allen");
       System.out.println(index);
       // last index shows last value of Allen=5;
       int w=s.lastIndexOf("Allen");
       System.out.println(w);
       //remove is to remove a word from an array;
       s.remove("Sharon");
       System.out.println(s);
       // to remove a value in a particular location;
      // s.remove(2);
       System.out.println(s.remove(""));
       //Get is to value
       /*String ob=s.get(1);
       System.out.println(ob);
       System.out.println(s.get(1));
       // finds whether the value is present or not;
       boolean y=s.contains("Sharon");
       System.out.println(y);*/
       
	}
	
	

}
