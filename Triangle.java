import java.util.*;

 class Area
{
double p,q;
public double area(double a, double b)
{
p=a;
q=b;
return 0.5*a*b;
}
}
public class Triangle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Base and Height");
double b=s.nextDouble();
double h=s.nextDouble();
Area a=new Area();
System.out.println("Area of Triangle is:"+a.area(b,h));
}
}


