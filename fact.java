import java.util.*;
class  fact
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		System.out.println( "The factors of "+ n +" are :");
		System.out.println(1);
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}

		}
		System.out.println(n);
		

	}
}
