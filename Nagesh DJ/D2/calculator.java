class calculator 
{
	public static int add(int a , int b)
	{
		int c = a + b;
		return c;
	}
		public static int addthree(int a , int b,int  c)
	{
		int d = a + b + c;
		return d;
	}
		public static int addfour(int a , int b, int c , int d )
	{
		int e = a + b + c + d;
		return e;
	}
		public static int addfive(int a , int b, int c , int d , int e)
	{
		int f = a + b + c + d + e;
		return f;
	}
		public static int addsix(int a , int b, int c , int d , int e , int f )
	{
		int g = a + b+ c+ d+ e+ f;
		return g;
	}

	public static void main(String[] args) 
	{
		int ref1 = add(10,5);
		int ref2 = addthree(10,5,5);
		int ref3 = addfour(10,5,5,6);
		int ref4 = addfive(10,5,5,6,2);
		int ref5 = addsix(10,5,5,6,2,3);
	

			   System.out.println(ref1);
				System.out.println(ref2);
				System.out.println(ref3);
				System.out.println(ref4);
				System.out.println(ref5);
				
	}
}
