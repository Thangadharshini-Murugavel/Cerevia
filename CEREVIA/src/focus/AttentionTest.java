
package focus;

import java.util.Scanner;

public class AttentionTest extends FocusExercise {

    public AttentionTest() {
        super("Attention and Concentration Test");
    }

    @Override
    public void start(Scanner s) {

        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;

        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("          ATTENTION AND CONCENTRATION");
        System.out.println("================================================");

        System.out.println("\nFocus carefully. Observe every detail.");
        System.out.println("Answer all five questions.\n");

        // Question 1: Target Detection
        System.out.println("\n------------------------------------------------");
        System.out.println("QUESTION 1 - TARGET DETECTION");
        System.out.println("How many times does the letter A appear?");
        System.out.println("B A C A D E A F G A H");

        System.out.print("Your answer: ");
        String answer = s.nextLine().trim();

        checkAnswer(answer.equals("4"));
        
        if (!answer.equals("4")) {
            System.out.println("Correct answer: 4");
        }

        // Question 2: Selective Attention
        System.out.println("\n------------------------------------------------");
        System.out.println("QUESTION 2 - SELECTIVE ATTENTION");
        System.out.println("Count the number of 7s in this sequence:");
        System.out.println("7 1 7 3 9 7 2 5 7 8 6 7");

        System.out.print("Your answer: ");
        answer = s.nextLine().trim();

        checkAnswer(answer.equals("5"));

        if (!answer.equals("5")) {
            System.out.println("Correct answer: 5");
        }

        // Question 3: Error Detection
        System.out.println("\n------------------------------------------------");
        System.out.println("QUESTION 3 - ERROR DETECTION");
        System.out.println("Which word is repeated?");
        System.out.println("BOOK PEN TABLE CHAIR PEN CLOCK");

        System.out.print("Your answer: ");
        answer = s.nextLine().trim();

        checkAnswer(answer.equalsIgnoreCase("PEN"));

        if (!answer.equalsIgnoreCase("PEN")) {
            System.out.println("Correct answer: PEN");
        }

        // Question 4: Concentration
        System.out.println("\n------------------------------------------------");
        System.out.println("QUESTION 4 - CONCENTRATION");
        System.out.println("How many times does 3 appear?");
        System.out.println("3 8 1 3 5 3 9 2 3 7 4 3");

        System.out.print("Your answer: ");
        answer = s.nextLine().trim();

        checkAnswer(answer.equals("5"));

        if (!answer.equals("5")) {
            System.out.println("Correct answer: 5");
        }

        // Question 5: Distraction Test
        System.out.println("\n------------------------------------------------");
        System.out.println("QUESTION 5 - DISTRACTION TEST");
        System.out.println("Find the number that breaks the pattern:");
        System.out.println("2 4 6 8 11 12 14");

        System.out.print("Your answer: ");
        answer = s.nextLine().trim();

        checkAnswer(answer.equals("11"));

        if (!answer.equals("11")) {
            System.out.println("Correct answer: 11");
        }

        showResult();

        System.out.println("\nKeep practising to strengthen your concentration!");
    }
}
