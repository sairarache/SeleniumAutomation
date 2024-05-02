package collection;

import java.util.LinkedList;


public class Linkedlist {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				LinkedList<String> c=new LinkedList<String>();
				c.add("Anvi");
				c.add("Saira");
				c.add("Java");
				c.add("Arya");
				c.add("Wednesday");
				c.addAll(c);
				System.out.println(c);
		        
				LinkedList<String> n=new LinkedList<String>();
				n.add("Java");
				n.add("Python");
				n.add("C");
				n.add("C++");
				c.addAll(n);
				System.out.println(c);
				
				boolean k=n.contains("Java");
				System.out.println(k);
				boolean l=c.contains("Anu");
				System.out.println(l);
				
				c.get(1);
				System.out.println(c.get(1));
				
				boolean n1=c.isEmpty();
				System.out.println(n1);
				
				n.remove(1);
				System.out.println(n);
				
				
				

			}

		


	

}
