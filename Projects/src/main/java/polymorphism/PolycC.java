package polymorphism;

public class PolycC extends Polyexp2
{
 public void example(String a, String b) 
 {
		super.example("Saira","Varghese");
		System.out.println("Example for overriding:" + "Firstname:"+ a +" " + "Secondname:"+ " "+b);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PolycC j=new PolycC();
		j.example("Manju","Susan");
		

	}

}
