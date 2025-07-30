import java.util.*;
public class Addition
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter the first number:");
Scanner s = new Scanner(System.in);
a = s.nextInt();
System.out.println("Enter the second number:");
b = s.nextInt();
c = a + b;
System.out.println("Addition is:"+c);
}
}
