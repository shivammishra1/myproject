 // Encapsulation

 class Emp
{
	int id;
	String name;
	private double sal;

	public double get()
	{
		return sal;
	}

	public void set(double sal)
	{
		this.sal = sal;
	}

	Emp(int id,String name,double sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void work()
	{
		System.out.println("Emp is working");
	}
}
class Company
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp(1,"Sheela",10000);
			System.out.println("empid :"+e1.id);
			System.out.println("empname :"+e1.name);
	}
}