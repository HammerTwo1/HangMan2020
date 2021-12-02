import java.util.*;
import java.io.*;

public class Hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Chose a letter: ");
        char letter = input.next().charAt(0);

        
        ArrayList<String> words = new ArrayList<>();

        try{  
           Scanner fScanner = new Scanner(new File("words.txt"));
            
            while(fScanner.hasNextLine()){

                words.add(fScanner.nextLine());
           }
        
        }catch(FileNotFoundException fnf){
            System.out.println("no file not found: " + fnf);
        } 
        
        char[] charecter = new char[10];

        String randomSelectedWord = words.get(rand(words.size()));

        for(int i = 0; i < randomSelectedWord.length(); i++){
            charecter[i] = randomSelectedWord.charAt(i);
        }
    }

    public static int rand(int numWords){

        int rand = (int)(Math.random()*numWords);
       

        return rand;
    }

}