mport java.util.*;
public class WhithouIfElse
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st value");
		a=sc.nextInt();
		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		int result = (a>b)?a:b;
		System.out.println(result+" is Greater");
		

	}
}