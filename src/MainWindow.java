/* ************************************************************************************
 * Class MainWindow is responsible for the gui of the first window the user sees upon
 * running the program. It contains the instructions for the game as well as a play
 * button.
 * ************************************************************************************** */
import javax.swing.*;
import java.awt.*;

public class MainWindow {

    //Constructor
    public MainWindow() {

        //Formatting of Main Window frame
        JFrame ww = new JFrame("Wordle");
        ww.setSize(800, 800);
        ww.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ww.setLayout(null);
        ww.setLocationRelativeTo(null);

        //Setting an icon for the program
        ImageIcon icon = new ImageIcon("icon.png");
        ww.setIconImage(icon.getImage());

        //Labels that welcome the user and demonstrate the game's instructions
        JLabel wl1 = new JLabel("Welcome to Wordle!");
        wl1.setBounds(240, 10, 300, 300);
        wl1.setFont(new Font("SansSerif", Font.BOLD, 30));
        ww.add(wl1);

        JLabel wl2 = new JLabel("Can you guess what 4-letter word I'm thinking of ?");
        wl2.setBounds(165, 50, 500, 300);
        wl2.setFont(new Font("SansSerif", Font.PLAIN, 20));
        ww.add(wl2);

        JLabel green = new JLabel("Green");
        green.setForeground(new Color(0x009900));
        green.setBounds(90, 240, 300, 420);
        green.setFont(new Font("SansSerif", Font.PLAIN, 16));
        ww.add(green);

        JLabel yellow = new JLabel("Yellow");
        yellow.setForeground(new Color(0xfff200));
        yellow.setBounds(90, 220, 300, 390);
        yellow.setFont(new Font("SansSerif", Font.PLAIN, 16));
        ww.add(yellow);

        JLabel grey = new JLabel("Grey");
        grey.setForeground(Color.darkGray);
        grey.setBounds(90, 200, 300, 360);
        grey.setFont(new Font("SansSerif", Font.PLAIN, 16));
        ww.add(grey);

        JLabel wl3 = new JLabel("Instructions:");
        wl3.setBounds(90, 150, 300, 300);
        wl3.setFont(new Font("SansSerif", Font.BOLD, 30));
        ww.add(wl3);

        JLabel wl4 = new JLabel("Enter your guess in the text bar, each letter in your guess will be marked by a color.");
        JLabel wl5 = new JLabel("     means the letter is not in the word.");
        JLabel wl6 = new JLabel("       means the letter is in the word but in an incorrect spot.");
        JLabel wl7 = new JLabel("      means the letter is in the word and in the correct spot.");

        wl4.setBounds(90, 180, 600, 330);
        wl4.setFont(new Font("SansSerif", Font.PLAIN, 16));
        ww.add(wl4);

        wl5.setBounds(105, 200, 600, 360);
        wl5.setFont(new Font("SansSerif", Font.PLAIN, 16));
        ww.add(wl5);

        wl6.setBounds(110, 220, 600, 390);
        wl6.setFont(new Font("SansSerif", Font.PLAIN, 16));
        ww.add(wl6);

        wl7.setBounds(110, 240, 600, 420);
        wl7.setFont(new Font("SansSerif", Font.PLAIN, 16));
        ww.add(wl7);

        // Play button that allows the user to start the game
        JButton play = new JButton("Play");
        play.setBounds(290, 530, 200, 50);
        ww.add(play);

        //Once clicked, the play button starts the game. It calls creates Wordle object and
        //generates a random word through it, as well as a GameWindow object which
        //the user will interact with for the rest of the game

        play.addActionListener(e->{
            GameWindow gw = new GameWindow();
            Wordle wordle = new Wordle();
            String randWord = wordle.wordRandomiser();
            gw.setAnswer(randWord);
            ww.dispose();
        });

        ww.setVisible(true);
    }

}