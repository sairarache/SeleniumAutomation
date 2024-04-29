package Interface;

public class Hospital implements Doctors,Nurses
{
	public void patients()
	{
		String a ="James jone";
		int id=67;
		System.out.println("Patient name:"+ " " + a+ "id:" + " "+ id);
	}

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		Hospital ob1=new Hospital();
		ob1.display();
		ob1.duty();
		ob1.patients();

	}

	@Override
	public void duty()
	{
		// TODO Auto-generated method stub
		System.out.println("Monday to Saturday:"+ "working hours 9 am to 5 pm");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Doctors are on leave on May 1st");
	}

}
