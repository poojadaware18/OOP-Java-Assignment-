import java.util.*;
public class Evenodd sum
{
public static void main(String args[])
{
int n, sumE = 0,sum0 = 0;
Scanner s new Scanner(System.in);
ystem.out.println("Enter the number of elements of array");
n = s.nextInt();
int[] a = new int[n];
System.out.println("Enter the elements of array:");
for(int i = 0;i < n;i++)
{
a[i] = s.nextInt();
}
for(int i = 0;i < n;i++)
{
if(a[i] % 2 == 0)
{
sumE = sumE + a[i];
}
else
{
sum0 = sum0 + a[i];
}
}
System.out.println("sum of even numbers:"+sumE);
System.out.println("sum of odd numbers:"+sum0);
}
}














