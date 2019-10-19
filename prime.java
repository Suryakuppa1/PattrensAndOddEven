import java.util.*;
class  prime
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Number");
		int n =scan.nextInt();
		int count = 0;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
			
		}
		if(count==0)
		{
		System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The Number is not prime");
		}

	}
}
