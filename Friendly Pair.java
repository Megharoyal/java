import java.util.Scanner;
public class Friendly
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();//6
      int b=sc.nextInt();//28
      int s1=0,s2=0,p=0,q=0;
      for(int i=1;i<=a;i++)//0123456
      {
          if(a%i==0)
          {
            s1=s1+i;  
          }
          p=s1/a;//063..
      }
      for(int j=1;j<=b;j++)//0123...28
      {
          if(b%j==0)
          {
          s2=s2+j;//0123..28
          }
          q=s2/b;
      }
          if(p==q)
      {
          System.out.println("Friendly Pair");
      }
      else
      {
          System.out.println("Not Friendly Pair");
      }
   
    }
}
