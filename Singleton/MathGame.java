import java.util.Random;
import java.util.Scanner;

/**
 * A math game that prompts the user to complete problems of
 * addition, subtraction, multiplication and division.
 * @author Chris Moore
 */
public class MathGame {
  private MathGame mathGame;
  private int score;
  private Random rand = new Random();
  private Scanner reader = new Scanner(System.in);
  private String[] operands = new String[] {"+", "-", "*", "/"};

  /**
   * Default constructor of MathGame
   */
  private MathGame() {
    Random rand = new Random();
    Scanner reader = new Scanner(System.in);
  }

  /**
   * Creates an instance of MathGame object
   * @return MathGame instance
   */
  public static MathGame getInstance() {
    MathGame mathGame = new MathGame();
    return mathGame;
  }

  /**
   * Plays or quits the game based on user input
   */
  public void play() {
    System.out.println("Let's have fun with math!\n(P)lay or (Q)uit:");
    String play = reader.nextLine();
    while (play.equalsIgnoreCase("P")) {
      playRound();
      System.out.println("(P)lay or (Q)uit:");
      reader.nextLine();
      play = reader.nextLine();
      if (play.equalsIgnoreCase("Q")) {
        System.out.println("You won "+score+" games!\nGoodbye");
        break;
      } 
      else if (play.equalsIgnoreCase("P")) {
        continue;
      } 
      else {
        System.out.println("Sorry, you must enter p or q.\n(P)lay or (Q)uit");
        play = reader.nextLine();
        continue;
      }
    }
    if (play.equalsIgnoreCase("Q")) {
      System.exit(0);
    }
  }

  /**
   * Bulk of the game content, prompts the user with randomly generated
   * problems and adjusts the score based on answer correctness
   * @return true or false, based on answer correctness
   */
  private boolean playRound() {
    double answer = 0;
    double guess = 0;
    int rand1 = rand.nextInt(101);
    int rand2 = rand.nextInt(101);
    int operation = rand.nextInt(4);
    switch (operation) {
      case 0: // addition
      System.out.println("Round answer to one decimal place\n" +rand1+ " + " +rand2);
      guess = reader.nextDouble();
      answer = rand1 + rand2;
      if(guess == answer) {
        System.out.println("You got it!");
        score++;
        return true;
      }
      else {
        System.out.println("The correct answer is: " +answer);
        return false;
      }
      case 1: // subtraction
      System.out.println("Round answer to one decimal place\n" +rand1+ " - " +rand2);
      guess = reader.nextDouble();
      answer = rand1 - rand2;
      if(guess == answer) {
        System.out.println("You got it!");
        score++;
        return true;
      }
      else {
        System.out.println("The correct answer is: " +answer);
        return false;
      }
      case 2: // multiplication
      System.out.println("Round answer to one decimal place\n" +rand1+ " * " +rand2);
      guess = reader.nextDouble();
      answer = rand1 * rand2;
      if(guess == answer) {
        System.out.println("You got it!");
        score++;
        return true;
      }
      else {
        System.out.println("The correct answer is: " +answer);
        return false;
      }
      case 3: // division
      System.out.println("Round answer to one decimal place\n" +rand1+ " / " +rand2);
      guess = reader.nextDouble();
      answer = rand1 / rand2;
      if(guess == answer) {
        System.out.println("You got it!");
        score++;
        return true;
      }
      else {
        System.out.println("The correct answer is: " +answer);
        return false;
      }
    }
    return false;
  }
}