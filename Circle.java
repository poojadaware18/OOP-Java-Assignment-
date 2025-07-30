import java.util.*;

 class Area
{
double p;
public double area(double r)
{
p=r;

return 3.14*r*r;
}
}
public class Circle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Radius");
double r=s.nextDouble();
Area a=new Area();
System.out.println("Area of circle is:"+a.area(r));
}
}


