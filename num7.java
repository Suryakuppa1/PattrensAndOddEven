import java.util.*;
class num7 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter the rows:");
		int n= scan.nextInt();
		System.out.println("The Required Rows are:");
		for(int i=0; i<n ; i++)
		{
			for (int j=0;j<n ;j++ )
			{
				if(j<=n-1-i)
				{
					System.out.print(j+1+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}
}
	


