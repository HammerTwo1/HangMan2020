import java.util.*;
import java.io.*;

public class Hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Chose a letter: ");
        String player = input.nextLine();

        
        String[] Words = new String[100];

        try
        {  
           Scanner fScanner = new Scanner(new File("words.txt"));
           
           
           
           while(fScanner.hasNextLine())
           {
              words = fScanner.nextLine();
           }
           
           System.out.println(s);
        
        }
        catch(FileNotFoundException fnf)
        {
           System.out.println("no file not found: " + fnf);
        } 
        
    }

    public static char word(String w){

        char ran = 'f';

        return ran;
    }

    public static void body(){

    }
}