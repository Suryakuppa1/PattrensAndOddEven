import java.util.Scanner;
class  evenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int i = scan.nextInt();
			if(i % 2==0)
			{
				System.out.println("The Number is Even");
			}
			else
			{
				System.out.println("The Number is odd");
			}
		
	}
}
