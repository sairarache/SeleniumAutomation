package collection;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("True");
		s.add("Saira");
		s.add("Java");
		s.addAll(s);
		System.out.println(s);
        // when there are 2 arraylist and need to combine
		ArrayList<String> f=new ArrayList<String>();
		f.add("blue");
		f.add("red");
		f.add("green");
		f.add("yellow");
		s.addAll(f);
		System.out.println(s);
		//contains;
		boolean n=f.contains("James");
		System.out.println(n);
		boolean l=f.contains("Anu");
		System.out.println(l);
		//get;
		s.get(1);
		System.out.println(s.get(1));
		//empty;
		boolean n1=f.isEmpty();
		System.out.println(n1);
		//remove
		f.remove(1);
		System.out.println(f);
		
		
		

	}

}
