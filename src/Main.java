 import java.util.Scanner;


public class Main
{

    static void convert(StringBuilder str)
    {
        str=str.reverse();
        int size= str.length();
        StringBuilder val= new StringBuilder();
        int result=0, count=0;
        for (int i=0; i<size;i ++)
        {

          if (count==3  )
          {
              val.append(result);
              count=0; result=0;
          }

          int num= (char)str.charAt(i)-'0';
          int power=(int)Math.pow(2,count);

         result =result+num *power;
         count+=1;
         if (i==size-1) val.append(result);

    }
        System.out.println(val.reverse() );
    }


    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        StringBuilder str  =new StringBuilder(sc.nextLine());
        sc.close();

        convert(str);






    }}
