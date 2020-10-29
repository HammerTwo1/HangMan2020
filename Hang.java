import java.util.*;
import java.io.*;

public class Hang {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // System.out.print("Chose a letter: ");
        // String player = input.nextLine();

        
        ArrayList<String> words = new ArrayList<>();

        try{  
           Scanner fScanner = new Scanner(new File("words.txt"));
            
            while(fScanner.hasNextLine()){

                words.add(fScanner.nextLine());
           }
        
        }catch(FileNotFoundException fnf){
            System.out.println("no file not found: " + fnf);
        } 
        
        System.out.println(rand(words.size()));
    }

    public static int rand(int numWords){

        int rand = (int)(Math.random()*numWords);
       

        return rand;
    }

}