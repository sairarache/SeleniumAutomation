package abstraction;

public abstract class Contractorclass
{

	public void fulltimeemployee(double rate)
	{
		double daily=rate*8;
		System.out.println("Total salary: "+ daily);
	}
	public abstract void calculatesalary();
	


}
