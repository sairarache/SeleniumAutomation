package abstraction;

public  class Employee extends Contractorclass
{
	public static void main(String args[])
	{
		Employee obj=new Employee();
		obj.calculatesalary();
		obj.fulltimeemployee(23.098d);
	}

	@Override
	public void calculatesalary() 
	{
		// TODO Auto-generated method stub
		float hours=5.5f;
		float hourlysalary=11.09f;
		float payment= hourlysalary*hours;
		System.out.println("Total amount of salary:"+ payment);
		
	}

}
