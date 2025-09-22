public class NullPointer
{
 public static void main(String args[])
 {
   try
   {
   String n=null;
   System.out.println("Length of String is:"+n.length());
   }
   catch(Exception e)
   {
    System.out.println("We cant find length of null String");
   } 
 }
}