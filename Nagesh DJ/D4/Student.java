
 class Student
{  
	
	int id ;
	String name;

	Student(int id , String name)
	{
	this.id= id;
	this.name=name;

	}
	
	public static void main(String[] args)
	{
		
	Student ref1 = new Student(1,"Sudra");	
	System.out.println("id"+ ref1.id);
	System.out.println("name"+ref1.name);
	
	Student ref2 = new Student(2,"Sudra");
	System.out.println("id"+ref2.id);
	System.out.println("name"+ref2.name);
	
	Student ref3 = new Student(3,"Sundari");
	System.out.println("id"+ref3.id);
	System.out.println("name"+ref3.name);
	
	Student ref4 = new Student(4,"munni");
	System.out.println("id"+ref4.id);
	System.out.println("name"+ref4.name);
	
	Student ref5 = new Student(5,"sheeru");
	System.out.println("id"+ref5.id);
	System.out.println("name"+ref5.name);
	
	Student ref6 = new Student(6,"laal");
	System.out.println("id"+ref6.id);
	System.out.println("name"+ref6.name);
	
}
}

