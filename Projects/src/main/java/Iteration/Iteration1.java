package Iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> k=new ArrayList<Integer>();
		k.add(2);
		k.add(4);
		k.add(5);
		k.add(7);
		k.add(6);
		System.out.println(k);
		Iterator<Integer> j= k.iterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
        k.remove(1);
        System.out.println(k);
	}

}
