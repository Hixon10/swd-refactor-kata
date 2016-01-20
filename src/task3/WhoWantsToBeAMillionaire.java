package task3;

import java.util.Scanner;

/**
 * Simplify and make Game API more robust where possible
 */
public class WhoWantsToBeAMillionaire {
  public static void main(String[] args) {
    Game game = new Game();
    game.addQuestion(new Question("What is the Capital of Great Britain?", "Paris", "Karaganda", "Dublin", "London"), "London");
    game.addQuestion(new Question("Who is the author of Godfather novel?", "Hemingway", "Puzo", "Vonnegut", "Tolstoy"), "Puzo");
    game.addQuestion(new Question("What is the distance to the Moon?", "156 000 km", "384 000 km", "432 000 km", "521 000 km"), "384 000 km");

    Scanner scanner = new Scanner(System.in);
    for (Question q : game) {
      System.out.println(q.q);
      System.out.println("1. " + q.answ1);
      System.out.println("2. " + q.answ2);
      System.out.println("3. " + q.answ3);
      System.out.println("4. " + q.answ4);

      Integer playerGuess = scanner.nextInt();
      if (!game.checkAnswer(q, playerGuess)) {
        throw new RuntimeException("You failed!");
      }
      System.out.println("Correct!");
    }

    System.out.println("Take your Million!");
  }
}
