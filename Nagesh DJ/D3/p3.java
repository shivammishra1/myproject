class p3
{
/*	static int a = 30;
	

	public void test()
	{
		int a = 40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(p3.a);
	}
	public void test1()
	{
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		p3 A = new p3();
		A.test();
		A.test1();
		
		
}
}*/
	p3()
	{
		System.out.println("no arg Constructor");
	}
	p3(int a)
	{
		
		System.out.println("1arg Constructor");
	}
	p3(int a ,int b)
	{
		System.out.println(" 2arg Constructor");
	}
	p3(int a , int b , int c)
	{ 
		this(int a, int b);
		System.out.println(" 3arg Constructor");
	}
	public static void main(String [] args)
	{
		
		p3 ref3 = new p3(10,20,30);
	}
		
		

	}