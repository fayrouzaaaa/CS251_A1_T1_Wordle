/* ************************************************************************************
 * Class Wordle is responsible for handling the logic of the game. It picks a random
 * word from a provided text file, checks if the user's guess is valid, checks if the
 * letters in a guess match the random word or if they are in an incorrect spot, and
 * it checks if a guess is correct.
 * ************************************************************************************** */


import java.io.*;
import java.util.ArrayList;

public class Wordle {

    //randomWord is the randomly picked word

    //guess is the user input/the user's guess

    //match is a boolean ArrayList of size four, the value for each element
    //is based on whether the letter of that index are identical in guess and
    //randomWord or not

    //semimatchGuess is a boolean ArrayList of size 4, the value for each element
    //is based on whether the letter at that index in guess exists in randomWord
    //but in a different spot

    //semimatchRandom is a boolean ArrayList of size 4, the value for each element
    //is based on whether the letter at that index in randomWord has already been
    //matched with one from guess or not

    public String randomWord;
    public String guess;
    public ArrayList<Boolean> match = new ArrayList<Boolean>();
    public ArrayList<Boolean> semimatchGuess = new ArrayList<Boolean>();
    public ArrayList <Boolean> semimatchRandom = new ArrayList<Boolean>();

    //Constructor where the attributes are initialised
    public Wordle(){
        randomWord = "";
        guess = "";

        for (int i=0; i<4; i++){
            match.add(false);
            semimatchGuess.add(false);
            semimatchRandom.add(false);
        }
    }


    //Setter for guess/ gets the user's guess from GameWindow
    public void setGuess(String g){
        guess = g;
    }

    //Picks a random word from the provided text file which the
    // user will have to figure out
    public String wordRandomiser(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            String line = reader.readLine();
            ArrayList<String> words = new ArrayList<String>();
            while (line != null){
                words.add(line);
                line = reader.readLine();
            }
            int random = (int)(Math.random()* words.size());
            randomWord = words.get(random);
        }
        catch (IOException e){
            System.out.println("Error handling file");
            System.exit(0);
        }


        return randomWord;
    }

    //Checks if the word that the user gave is in the provided text file or not
    public boolean isValidWord(String word){
        boolean flag = false;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            String line = reader.readLine();
            ArrayList<String> words = new ArrayList<String>();
            while (line != null){
                words.add(line);
                line = reader.readLine();
            }
            if (words.contains(word)){
                flag = true;
            }
            else {
                flag = false;
            }
        }
        catch (IOException e){
            System.out.println("Error handling file");
            System.exit(0);
        }
        return flag;
    }

    //Setter for the randomWord
    public void setRandomWord(String s){
        randomWord = s;
    }


    //Function that determines which letters in guess are in the correct spot
    public void correctSpot(){
        String g = guess;
        String rw = randomWord;

        for (int i=0; i<4; i++){
            if (g.charAt(i) == rw.charAt(i)){
                match.set(i,true);
            }
        }
    }

    //Function that determines which letters in guess are in the random word
    //but in an incorrect spot
    public void incorrectSpot(){
        String g = guess;
        String rw = randomWord;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                boolean flag = (g.charAt(i) == rw.charAt(j)) && (!match.get(j)) && (!semimatchRandom.get(j));
                if (flag){
                    semimatchRandom.add(j,true);
                    semimatchGuess.add(i,true);
                    break;
                }
            }
        }
    }

    //Function that determines whether the user's guess is the same as the
    //randomWord or not, i.e it determines whether the user won or not
    public boolean isCorrectGuess(){
        boolean flag= true;
        for (int i=0; i<match.size(); i++){
            flag = (flag && match.get(i));
        }
        return flag;
    }

}

