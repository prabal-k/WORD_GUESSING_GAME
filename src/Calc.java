import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {
    static char ch ;
    static Scanner scan = new Scanner(System.in);
    public static void Input(char character3[])
    {

        System.out.println("\nEnter the character : ");
        ch = scan.next().charAt(0);
        verify(character3);
        //System.out.println(ch);

    }
    public static void verify(char character4[])
    {
        int count=0;


        for(int i=0;i<character4.length;i++)
        {
            count++;
            if(character4[i]==ch)
            {
                break;
            }

        }
        System.out.println("count = "+count);
        int j=1;
        for(int i=0;i<character4.length;i++)
        {
            for(j=1;j<character4.length;j=j+2)   //TO HIDE CERTAIN CHARACTER WITH * WE USED 2ND LOOP OF J
            {
                if(j==count-1)
                    continue;
                character4[j] = '*';
            }
            System.out.print(character4[i]+" ");

        }
        String str =new String(character4);
        char character5[] = str.toCharArray();

     //Input(character8);

    }

}
