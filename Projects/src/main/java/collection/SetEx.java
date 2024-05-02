package collection;


import java.util.HashSet;
import java.util.Set;

public interface SetEx {
	public static void main(String args[])
	{
		Set<String> j= new HashSet<String>();  
		j.add("Sanju");
		j.add("Samson");
		j.add("Virat");
		j.add("Kohli");
		j.add("Swewag");
		j.add("Allen");
		
		System.out.println(j);
       
      
      
      j.remove("Virat");
       System.out.println(j);
      
       boolean y=j.contains("Sharon");
       System.out.println(y);
	}
       

}
