import java.util.*;

class prime_number 
{
	public static void main(String[] args) 
	{	
		int n ,count=0;	
		System.out.println("Enter the Numbber");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 1;i<n ;i++ )
		{ 
			if (i % n ==0)
			{
				count++;
				System.out.println("prime number");
				
			}
		}
			
		
			if (count==2)
			{
			System.out.println("not prime number");
			}
			
		}
	
}
