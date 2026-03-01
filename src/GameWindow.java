/* ************************************************************************************
 * Class GameWindow is responsible for the gui of the second window the user sees upon
 * running the program. It contains a grid-like interface that gets updated with the
 * user's guesses and contains the appropriate buttons that handle the user's actions.
 * ************************************************************************************** */

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GameWindow {

    //answer is the variable that holds the random word the computer picks each turn
    //counter is the variable that holds the number of guesses the user has made each turn
    public String answer;
    public int counter =1;

    //Constructor
    public GameWindow(){

        //Formatting of Game Window frame
        JFrame gw = new JFrame("Wordle");
        gw.setSize(800,800);
        gw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gw.setLayout(null);
        gw.setLocationRelativeTo(null);

        //Settin an icon for the program
        ImageIcon icon = new ImageIcon("icon.png");
        gw.setIconImage(icon.getImage());

        //Creating panels where each panel will hold a letter from the user's guess
        JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
                p11, p12, p13, p14, p15, p16, p17, p18, p19, p20;

        //Formatting the panels
        p1 = new JPanel();
        p1.setBounds(210,40,75,75);
        p1.setBorder(BorderFactory.createLineBorder(Color.black));

        p2 = new JPanel();
        p2.setBounds(305, 40, 75, 75);
        p2.setBorder(BorderFactory.createLineBorder(Color.black));

        p3 = new JPanel();
        p3.setBounds(400, 40, 75, 75);
        p3.setBorder(BorderFactory.createLineBorder(Color.black));

        p4 = new JPanel();
        p4.setBounds(495, 40, 75, 75);
        p4.setBorder(BorderFactory.createLineBorder(Color.black));

        p5 = new JPanel();
        p5.setBounds(210, 135, 75, 75);
        p5.setBorder(BorderFactory.createLineBorder(Color.black));

        p6 = new JPanel();
        p6.setBounds(305,135,75,75);
        p6.setBorder(BorderFactory.createLineBorder(Color.black));

        p7 = new JPanel();
        p7.setBounds(400,135,75,75);
        p7.setBorder(BorderFactory.createLineBorder(Color.black));

        p8 = new JPanel();
        p8.setBounds(495,135,75,75);
        p8.setBorder(BorderFactory.createLineBorder(Color.black));

        p9 = new JPanel();
        p9.setBounds(210,230,75,75);
        p9.setBorder(BorderFactory.createLineBorder(Color.black));

        p10 = new JPanel();
        p10.setBounds(305,230,75,75);
        p10.setBorder(BorderFactory.createLineBorder(Color.black));

        p11 = new JPanel();
        p11.setBounds(400,230,75,75);
        p11.setBorder(BorderFactory.createLineBorder(Color.black));

        p12 = new JPanel();
        p12.setBounds(495,230,75,75);
        p12.setBorder(BorderFactory.createLineBorder(Color.black));

        p13 = new JPanel();
        p13.setBounds(210,325,75,75);
        p13.setBorder(BorderFactory.createLineBorder(Color.black));

        p14 = new JPanel();
        p14.setBounds(305,325,75,75);
        p14.setBorder(BorderFactory.createLineBorder(Color.black));

        p15 = new JPanel();
        p15.setBounds(400,325,75,75);
        p15.setBorder(BorderFactory.createLineBorder(Color.black));

        p16 = new JPanel();
        p16.setBounds(495,325,75,75);
        p16.setBorder(BorderFactory.createLineBorder(Color.black));

        p17 = new JPanel();
        p17.setBounds(210,420,75,75);
        p17.setBorder(BorderFactory.createLineBorder(Color.black));

        p18 = new JPanel();
        p18.setBounds(305,420,75,75);
        p18.setBorder(BorderFactory.createLineBorder(Color.black));

        p19 = new JPanel();
        p19.setBounds(400,420,75,75);
        p19.setBorder(BorderFactory.createLineBorder(Color.black));

        p20 = new JPanel();
        p20.setBounds(495,420,75,75);
        p20.setBorder(BorderFactory.createLineBorder(Color.black));

        //Adding panels to the Game Window
        gw.add(p1);
        gw.add(p2);
        gw.add(p3);
        gw.add(p4);
        gw.add(p5);
        gw.add(p6);
        gw.add(p7);
        gw.add(p8);
        gw.add(p9);
        gw.add(p10);
        gw.add(p11);
        gw.add(p12);
        gw.add(p13);
        gw.add(p14);
        gw.add(p15);
        gw.add(p16);
        gw.add(p17);
        gw.add(p18);
        gw.add(p19);
        gw.add(p20);

        //Creating labels, each one will represent a letter from the user's guess
        //They are invisible at the start of the game, and after each guess, the
        //appropriate label becomes visible
        JLabel l1= new JLabel("");
        l1.setBounds(17,0,75,75);
        l1.setFont(new Font ("SansSerif", Font.PLAIN, 50));
        l1.setForeground(Color.white);
        p1.add(l1);
        l1.setVisible(false);

        JLabel l2 = new JLabel("");
        l2.setBounds(17, 0, 75, 75);
        l2.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l2.setForeground(Color.white);
        p2.add(l2);
        l2.setVisible(false);

        JLabel l3 = new JLabel("");
        l3.setBounds(17, 0, 75, 75);
        l3.setFont(new Font("Sans Serif", Font.PLAIN, 50));
        l3.setForeground(Color.white);
        p3.add(l3);
        l3.setVisible(false);

        JLabel l4 = new JLabel("");
        l4.setBounds(17, 0, 75, 75);
        l4.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l4.setForeground(Color.white);
        p4.add(l4);
        l4.setVisible(false);

        JLabel l5 = new JLabel("" );
        l5.setBounds(17, 0, 75, 75);
        l5.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l5.setForeground(Color.white);
        p5.add(l5);
        l5.setVisible(false);

        JLabel l6 = new JLabel("");
        l6.setBounds(17, 0, 75, 75);
        l6.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l6.setForeground(Color.white);
        p6.add(l6);
        l6.setVisible(false);

        JLabel l7 = new JLabel("");
        l7.setBounds(17, 0, 75, 75);
        l7.setFont(new Font("Sans Serif", Font.PLAIN, 50));
        l7.setForeground(Color.white);
        p7.add(l7);
        l7.setVisible(false);

        JLabel l8 = new JLabel("");
        l8.setBounds(17, 0, 75, 75);
        l8.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l8.setForeground(Color.white);
        p8.add(l8);
        l8.setVisible(false);

        JLabel l9 = new JLabel("");
        l9.setBounds(17, 0, 75, 75);
        l9.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l9.setForeground(Color.white);
        p9.add(l9);
        l9.setVisible(false);

        JLabel l10 = new JLabel("");
        l10.setBounds(17, 0, 75, 75);
        l10.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l10.setForeground(Color.white);
        p10.add(l10);
        l10.setVisible(false);

        JLabel l11 = new JLabel("");
        l11.setBounds(17, 0, 75, 75);
        l11.setFont(new Font("Sans Serif", Font.PLAIN, 50));
        l11.setForeground(Color.white);
        p11.add(l11);
        l11.setVisible(false);

        JLabel l12 = new JLabel("");
        l12.setBounds(17, 0, 75, 75);
        l12.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l12.setForeground(Color.white);
        p12.add(l12);
        l12.setVisible(false);

        JLabel l13 = new JLabel("");
        l13.setBounds(17, 0, 75, 75);
        l13.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l13.setForeground(Color.white);
        p13.add(l13);
        l13.setVisible(false);

        JLabel l14 = new JLabel("");
        l14.setBounds(17, 0, 75, 75);
        l14.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l14.setForeground(Color.white);
        p14.add(l14);
        l14.setVisible(false);

        JLabel l15 = new JLabel("");
        l15.setBounds(17, 0, 75, 75);
        l15.setFont(new Font("Sans Serif", Font.PLAIN, 50));
        l15.setForeground(Color.white);
        p15.add(l15);
        l15.setVisible(false);

        JLabel l16 = new JLabel("");
        l16.setBounds(17, 0, 75, 75);
        l16.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l16.setForeground(Color.white);
        p16.add(l16);
        l16.setVisible(false);

        JLabel l17 = new JLabel("");
        l17.setBounds(17, 0, 75, 75);
        l17.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l17.setForeground(Color.white);
        p17.add(l17);
        l17.setVisible(false);

        JLabel l18 = new JLabel("");
        l18.setBounds(17, 0, 75, 75);
        l18.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l18.setForeground(Color.white);
        p18.add(l18);
        l18.setVisible(true);

        JLabel l19 = new JLabel("");
        l19.setBounds(17, 0, 75, 75);
        l19.setFont(new Font("Sans Serif", Font.PLAIN, 50));
        l19.setForeground(Color.white);
        p19.add(l19);
        l19.setVisible(false);

        JLabel l20 = new JLabel("");
        l20.setBounds(17, 0, 75, 75);
        l20.setFont(new Font("SansSerif", Font.PLAIN, 50));
        l20.setForeground(Color.white);
        p20.add(l20);
        l20.setVisible(false);

        //Label that prompts the user to enter their guess
        JLabel label = new JLabel("Your Guess: ");
        label.setBounds(160,520, 100, 50);
        label.setFont(new Font("SansSerif", Font.PLAIN, 16));
        gw.add(label);

        //winMessage is a label that appears once the user guesses correctly to let them know they won
        JLabel winMessage = new JLabel("Congratulations, You guessed correctly!");
        winMessage.setBounds(250,600, 300, 30);
        winMessage.setFont(new Font("SansSerif", Font.PLAIN, 16));
        gw.add(winMessage);
        winMessage.setVisible(false);


        //loseMessage is a label that appears once the user runs out of guesses to let them know they lost
        JLabel loseMessage = new JLabel("You've run out of guesses.");
        loseMessage.setBounds(300, 580, 300, 30);
        loseMessage.setFont(new Font ("SansSerif", Font.PLAIN, 16));
        gw.add(loseMessage);
        loseMessage.setVisible(false);


        //guessReveal is a label that appears when the user loses to introduce the answer
        //(the random word that the computer has)
        JLabel guessReveal = new JLabel ("The word is: ");
        guessReveal.setBounds(320, 620, 300, 30);
        guessReveal.setFont(new Font("SansSerif",Font.PLAIN, 16));
        gw.add(guessReveal);
        guessReveal.setVisible(false);


        //reveal is a label that holds the value of the answer
        JLabel reveal = new JLabel ("");
        reveal.setBounds(410,620,300,30);
        reveal.setFont(new Font ("SansSerif",Font.BOLD, 16));
        gw.add(reveal);
        gw.setVisible(false);

        //Th text field where the user can type their guess
        JTextField guessBar = new JTextField ();
        guessBar.setBounds(260, 535, 220, 30);
        gw.add(guessBar);

        //Once the game ends, the playAgain button is shown. If clicked, it takes the user
        //to a new GameWindow with a new randomly picked word
        JButton playAgain = new JButton("Play Again");
        playAgain.setBounds(250, 680, 100, 30);
        gw.add(playAgain);
        playAgain.setVisible(false);

        //Once the game ends, the close button is shown. If clicked, it terminates the program
        JButton close = new JButton("Close");
        close.setBounds(450, 680,100,30);
        gw.add(close);
        close.setVisible(false);

        //When enter is clicked, the user's guess is taken from guessBar (textfield) and evaluated
        JButton enter = new JButton ("Enter");
        enter.setBounds(490,535,100,30);
        gw.add(enter);


        //Implementing the action of playAgain button
        playAgain.addActionListener(e->{

            //A new wordle object is created and a new random word is picked
            Wordle w = new Wordle();
            this.setAnswer(w.wordRandomiser());

            //Number of guesses represented by counter is reset to 1
            counter =1;

            //The enter button becomes visible again and any message or button that appears
            //on the screen once the game ends is set to be invisible
            enter.setVisible(true);
            winMessage.setVisible(false);
            loseMessage.setVisible(false);
            guessReveal.setVisible(false);
            reveal.setVisible(false);
            close.setVisible(false);
            playAgain.setVisible(false);

            //The panels are set to be white again
            p1.setBackground(Color.white);
            p2.setBackground(Color.white);
            p3.setBackground(Color.white);
            p4.setBackground(Color.white);
            p5.setBackground(Color.white);
            p6.setBackground(Color.white);
            p7.setBackground(Color.white);
            p8.setBackground(Color.white);
            p9.setBackground(Color.white);
            p10.setBackground(Color.white);
            p11.setBackground(Color.white);
            p12.setBackground(Color.white);
            p13.setBackground(Color.white);
            p14.setBackground(Color.white);
            p15.setBackground(Color.white);
            p16.setBackground(Color.white);
            p17.setBackground(Color.white);
            p18.setBackground(Color.white);
            p19.setBackground(Color.white);
            p20.setBackground(Color.white);

            //The labels which represent the users guesses are set to be invisible
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(false);
            l4.setVisible(false);
            l5.setVisible(false);
            l6.setVisible(false);
            l7.setVisible(false);
            l8.setVisible(false);
            l9.setVisible(false);
            l10.setVisible(false);
            l11.setVisible(false);
            l12.setVisible(false);
            l13.setVisible(false);
            l14.setVisible(false);
            l15.setVisible(false);
            l16.setVisible(false);
            l17.setVisible(false);
            l18.setVisible(false);
            l19.setVisible(false);
            l20.setVisible(false);


        });


        //Implementing the action of close button
        close.addActionListener(c->{
            System.exit(0);
        });


        //Implementing the action of enter button
        enter.addActionListener(e->{
            //wordle object will handle the logic of the game through GUI interactions
            Wordle wordle = new Wordle();

            //guess variable holds the user's guess
            String guess = guessBar.getText();
            guessBar.setText("");

            //The user's guess is evaluated to be valid or invalid through isValidWord() from
            //the wordle class. If the word is valid, the program continues normally. Otherwise,
            //an error window appears, informing the user that their guess is invalid
            if (!wordle.isValidWord(guess.toLowerCase())){

                //Formatting of error frame
                JFrame error = new JFrame ("Error");
                error.setSize(600,350);
                error.setLayout(null);
                error.setLocationRelativeTo(null);
                error.setIconImage(icon.getImage());

                //Labels that act as error messages
                JLabel message1 = new JLabel ("The word you entered is invalid");
                JLabel message2 = new JLabel("Please enter another word");
                message1.setBounds(100, 50, 500, 50);
                message2.setBounds(165,120, 500, 50);
                message1.setFont(new Font ("SansSerif", Font.BOLD, 25));
                message2.setFont(new Font("SansSerif", Font.PLAIN, 20));
                error.add(message1);
                error.add(message2);

                //When ok button is clicked, the error window is closed and the user is taken
                //back to the game window and prompted to enter another guess
                JButton ok = new JButton ("OK");
                ok.setBounds(250, 200, 90, 30);
                ok.addActionListener(ev->{
                    error.dispose();
                });
                error.add(ok);

                error.setVisible(true);
            }

            //Normal flow of program that occurs when the user's guess is valid
            else {
                if (counter < 6) {

                    //Handles the main logic of the game. The guess and the random word are
                    //passed to the wordle object. The guess is then evaluated where the letters
                    //that are in the correct spot, as well as the letters that are in the word
                    //but in a different spot are marked. This is all handled in Wordle class
                    wordle.setRandomWord(answer);
                    wordle.setGuess(guess.toLowerCase());
                    wordle.correctSpot();
                    wordle.incorrectSpot();


                    //A switch case that handles revealing what parts of the user's guess are
                    //correct (green), in an incorrect spot (yellow) or completely incorrect
                    //through the previously initialised panels and labels
                    //This is determined by the number of guess (counter) and the index of the
                    //letter in guess

                    switch (counter) {

                        case 1:
                            l1.setText(("" + guess.charAt(0)).toUpperCase());
                            l1.setVisible(true);

                            l2.setText(("" + guess.charAt(1)).toUpperCase());
                            l2.setVisible(true);

                            l3 .setText(("" + guess.charAt(2)).toUpperCase());
                            l3.setVisible(true);

                            l4.setText(("" + guess.charAt(3)).toUpperCase());
                            l4.setVisible(true);


                            if (wordle.match.get(0)) {
                                makeGreen(p1);
                            } else if (wordle.semimatchGuess.get(0)) {
                                makeYellow(p1);
                            } else {
                                makeGray(p1);
                            }

                            if (wordle.match.get(1)) {
                                makeGreen(p2);
                            } else if (wordle.semimatchGuess.get(1)) {
                                makeYellow(p2);
                            } else {
                                makeGray(p2);
                            }

                            if (wordle.match.get(2)) {
                                makeGreen(p3);
                            } else if (wordle.semimatchGuess.get(2)) {
                                makeYellow(p3);
                            } else {
                                makeGray(p3);
                            }

                            if (wordle.match.get(3)) {
                                makeGreen(p4);
                            } else if (wordle.semimatchGuess.get(3)) {
                                makeYellow(p4);
                            } else {
                                makeGray(p4);
                            }
                            break;

                        case 2:

                            l5.setText(("" + guess.charAt(0)).toUpperCase());
                            l5.setVisible(true);

                            l6.setText(("" + guess.charAt(1)).toUpperCase());
                            l6.setVisible(true);

                            l7.setText(("" + guess.charAt(2)).toUpperCase());
                            l7.setVisible(true);

                            l8.setText(("" + guess.charAt(3)).toUpperCase());
                            l8.setVisible(true);


                            if (wordle.match.get(0)) {
                                makeGreen(p5);
                            } else if (wordle.semimatchGuess.get(0)) {
                                makeYellow(p5);
                            } else {
                                makeGray(p5);
                            }

                            if (wordle.match.get(1)) {
                                makeGreen(p6);
                            } else if (wordle.semimatchGuess.get(1)) {
                                makeYellow(p6);
                            } else {
                                makeGray(p6);
                            }

                            if (wordle.match.get(2)) {
                                makeGreen(p7);
                            } else if (wordle.semimatchGuess.get(2)) {
                                makeYellow(p7);
                            } else {
                                makeGray(p7);
                            }

                            if (wordle.match.get(3)) {
                                makeGreen(p8);
                            } else if (wordle.semimatchGuess.get(3)) {
                                makeYellow(p8);
                            } else {
                                makeGray(p8);
                            }
                            break;

                        case 3:

                            l9.setText(("" + guess.charAt(0)).toUpperCase());
                            l9.setVisible(true);

                            l10.setText(("" + guess.charAt(1)).toUpperCase());
                            l10.setVisible(true);

                            l11.setText(("" + guess.charAt(2)).toUpperCase());
                            l11.setVisible(true);

                            l12.setText(("" + guess.charAt(3)).toUpperCase());
                            l12.setVisible(true);

                            if (wordle.match.get(0)) {
                                makeGreen(p9);
                            } else if (wordle.semimatchGuess.get(0)) {
                                makeYellow(p9);
                            } else {
                                makeGray(p9);
                            }

                            if (wordle.match.get(1)) {
                                makeGreen(p10);
                            } else if (wordle.semimatchGuess.get(1)) {
                                makeYellow(p10);
                            } else {
                                makeGray(p10);
                            }

                            if (wordle.match.get(2)) {
                                makeGreen(p11);
                            } else if (wordle.semimatchGuess.get(2)) {
                                makeYellow(p11);
                            } else {
                                makeGray(p11);
                            }

                            if (wordle.match.get(3)) {
                                makeGreen(p12);
                            } else if (wordle.semimatchGuess.get(3)) {
                                makeYellow(p12);
                            } else {
                                makeGray(p12);
                            }
                            break;

                        case 4:

                            l13.setText(("" + guess.charAt(0)).toUpperCase());
                            l13.setVisible(true);

                            l14.setText(("" + guess.charAt(1)).toUpperCase());
                            l14.setVisible(true);

                            l15.setText(("" + guess.charAt(2)).toUpperCase());
                            l15.setVisible(true);

                            l16.setText(("" + guess.charAt(3)).toUpperCase());
                            l16.setVisible(true);

                            if (wordle.match.get(0)) {
                                makeGreen(p13);
                            } else if (wordle.semimatchGuess.get(0)) {
                                makeYellow(p13);
                            } else {
                                makeGray(p13);
                            }

                            if (wordle.match.get(1)) {
                                makeGreen(p14);
                            } else if (wordle.semimatchGuess.get(1)) {
                                makeYellow(p14);
                            } else {
                                makeGray(p14);
                            }

                            if (wordle.match.get(2)) {
                                makeGreen(p15);
                            } else if (wordle.semimatchGuess.get(2)) {
                                makeYellow(p15);
                            } else {
                                makeGray(p15);
                            }

                            if (wordle.match.get(3)) {
                                makeGreen(p16);
                            } else if (wordle.semimatchGuess.get(3)) {
                                makeYellow(p16);
                            } else {
                                makeGray(p16);
                            }
                            break;

                        case 5:

                            l17.setText(("" + guess.charAt(0)).toUpperCase());
                            l17.setVisible(true);

                            l18.setText(("" + guess.charAt(1)).toUpperCase());
                            l18.setVisible(true);

                            l19.setText(("" + guess.charAt(2)).toUpperCase());
                            l19.setVisible(true);

                            l20.setText(("" + guess.charAt(3)).toUpperCase());
                            l20.setVisible(true);


                            if (wordle.match.get(0)) {
                                makeGreen(p17);
                            } else if (wordle.semimatchGuess.get(0)) {
                                makeYellow(p17);
                            } else {
                                makeGray(p17);
                            }

                            if (wordle.match.get(1)) {
                                makeGreen(p18);
                            } else if (wordle.semimatchGuess.get(1)) {
                                makeYellow(p18);
                            } else {
                                makeGray(p18);
                            }

                            if (wordle.match.get(2)) {
                                makeGreen(p19);
                            } else if (wordle.semimatchGuess.get(2)) {
                                makeYellow(p19);
                            } else {
                                makeGray(p19);
                            }

                            if (wordle.match.get(3)) {
                                makeGreen(p20);
                            } else if (wordle.semimatchGuess.get(3)) {
                                makeYellow(p20);
                            } else {
                                makeGray(p20);
                            }
                            break;

                        default:
                            break;
                    }

                    //Checks if the user's guess is correct. If it is, winMessage,
                    //playAgain and close buttons are revealed and the enter button
                    //is set to be invisible

                    if (wordle.isCorrectGuess()){

                        enter.setVisible(false);
                        winMessage.setVisible(true);
                        playAgain.setVisible(true);
                        close.setVisible(true);
                    }

                    //Incrementing counter after each guess
                    ++counter;
                }

                //Checks if the user's guess is correct. If it is, loseMessage,
                //guessReveal, playAgain and close buttons are revealed and the enter
                //button is set to be invisble

                if (counter==6 && !wordle.isCorrectGuess()) {
                    enter.setVisible(false);
                    loseMessage.setVisible(true);
                    guessReveal.setVisible(true);
                    playAgain.setVisible(true);
                    close.setVisible(true);

                    reveal.setText(answer);
                    reveal.setVisible(true);
                }
            }

        });
        gw.setVisible(true);
    }

    //Function to set the answer to the string provided as a parameter
    public void setAnswer(String a){
        answer = a;
    }

    //Function to make a panel green
    public void makeGreen(JPanel p){
        p.setBackground(new Color(0x009900));
    }

    //Function to make a panel yellow
    public void makeYellow(JPanel p){
        p.setBackground(new Color(0xfff200));
    }

    //Function to make a panel gray
    public void makeGray(JPanel p){ p.setBackground(Color.darkGray);}
}