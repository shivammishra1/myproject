class recursion 
{
	public static void test()
	{
		System.out.println("hello  recursion");
		test();
	}

	public static void main(String[] args) 
	{
		System.out.println("MB");
		test();
		System.out.println("ME");
	}
}
