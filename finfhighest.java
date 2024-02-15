import java.util.Scanner;
class findhighest
 {
  public static void main(String args[])
  {
   int number;
   int marks[]=new int[10];
   Scanner S1 =new Scanner(System.in);
   int highest=0;
   System.out.println("Enter marks:");
   for (int i=0;i<10;i++)
      {
      System.out.println("Enter marks of student="+(i+1));
      number=S1.nextInt();
      marks[i]=number;
      }
     for (int i=0;i<10;i++)
      {
       if (marks[i]>highest)
        highest=marks[i];
      }
        System.out.println("Highest marks="+highest);
     }
  }