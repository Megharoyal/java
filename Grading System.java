import java.util.*;
public class Grade
{
    public static void main(String args[])
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks==100)
        {
            System.out.println("s");
        }
        else if(marks>=90 &&marks<100)
        {
            System.out.println("A");
            
        }
         else if(marks>=80 &&marks<=90)
        {
            System.out.println("B");
         }
          else if(marks>=70 &&marks<80)
        {
            System.out.println("C");
            
        }
         else if(marks>=60 &&marks<=70)
        {
            System.out.println("D");
            
        }
         else if(marks>=50 &&marks<60)
        {
            System.out.println("A");
            
        }
        else if(marks<50)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
