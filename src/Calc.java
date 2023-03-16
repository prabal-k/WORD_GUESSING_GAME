import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {
    static char ch ;
    static Scanner scan = new Scanner(System.in);
    public static void Input(char character[],char character3[])
    {

        System.out.println("\n\t\tGuess a character : ");
        ch = scan.next().charAt(0);
        verify(character,character3);

    }
    public static void verify(char character6[],char character4[])
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
        character6[count-1]=character4[count-1];

        for(int i=0;i<character4.length;i++)
        {
            System.out.print(character6[i]+" ");
        }
        String str =new String(character4);
        char character5[] = str.toCharArray();


    }

}
