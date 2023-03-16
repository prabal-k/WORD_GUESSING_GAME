import java.util.Random;

public class Main {
    static String[] arr = {"Simultaneously","Battleroyal","Arbitary","Disinterested"};
    public static void main(String[] args)

    {
        System.out.println("\n\t\tWELCOME TO THE WORD GUESSING GAME\n ");

        Random random = new Random();
        int x = random.nextInt(arr.length);
        System.out.println(x);
        String arr2 = arr[x];
        //TO CONVERT THE STRING ie arr2 to Character ;
        char[] character = arr2.toCharArray();

        //String str = new String(character2); //TO convert array of character to string;
        int j=1;
        System.out.println("\t\t");
        for (int i = 0; i < character.length; i++)
        {
            for(j=1;j<character.length;j=j+2)   //TO HIDE CERTAIN CHARACTER WITH * WE USED 2ND LOOP OF J
            {
                character[j] = '_';                 //TO HIDE THE CHARACTERS
            }
            System.out.print(character[i]+" ");
        }

        Calc Obj = new Calc();
        for(int i=0;i<character.length/2;i++)
        {
            char[] character2 = arr2.toCharArray();
            Obj.Input(character,character2);
        }



    }
}