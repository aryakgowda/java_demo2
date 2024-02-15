import java.util .Scanner;
class findarea
{
 public static void main(String args[])
{
 double pi=3.14,area;
 Scanner S=new Scanner(System.in);
 System.out.println("Enter the radius of area");
 int radius =S.nextInt();
   area=pi*radius*radius;
 System.out.println("area of circle is"+area);
}
}
