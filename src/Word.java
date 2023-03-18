import java.util.Scanner;

public class Word {
    static Scanner scan = new Scanner(System.in);
    static void input(String str)
    {
        System.out.println("\n\t\tGuess the word: ");
        String string = scan.nextLine();
       // System.out.println("Str is: "+str);
        if(str.equals(string))
        {
            System.out.println("\n\t\tCongratulation you guessed the correct word i.e \t"+string);
        }
        else
        {
            System.out.println("\n\t\tSorry your guess is incorrect");
        }
    }
}
