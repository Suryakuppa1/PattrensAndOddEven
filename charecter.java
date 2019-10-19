import java.util.Scanner;
class charecter 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s= scan.nextLine();
		for(int i=0; i<=s.length()-1; i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}
