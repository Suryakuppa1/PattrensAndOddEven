//Reverse String
import java.util.Scanner;
class  strRev
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter The String:");
		String s= scan.nextLine();
		String t="";
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			t=t+s.charAt(i);
		}
		System.out.println(t.toUpperCase());
	}
}
