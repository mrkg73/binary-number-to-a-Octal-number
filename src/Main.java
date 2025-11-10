import java.util.Scanner;

public class Main
{

    // Method to convert binary to hex
    static void convert(StringBuilder val)
    {
        // Reversing the characters
        val =val.reverse();
        int size =val.length();

        // New StringBuilder to hold the result
        StringBuilder val2 = new StringBuilder();
        int res=0, num; double po=0;

        for (int i=0; i<size; i++)
        {
            if(po<4 )
            {
            num =val.charAt(i)-'0';
            res +=num*(int)Math.pow(2,po);
            po +=1;
            }

         else {
                val2 = val2.append(res); po=0;res=0; i-=1;

              }
         if (i==size-1) val2 = val2.append(res);
            }
        System.out.println(val2.reverse());
        }



    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        StringBuilder val  =new StringBuilder(sc.nextLine());

        convert(val);

    }}
