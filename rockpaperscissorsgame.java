import java.util.Random;
import java.util.Scanner;

package com;

public class rockpaperscissorsgame {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Enter Rock, Paper or Scissors: ");
        String userChoice = n.nextLine();

        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        
        String systemChoice = choices[random.nextInt(3)];

        System.out.println("System: " + systemChoice);

        if (userChoice.equalsIgnoreCase(systemChoice)) {
            System.out.println("draw");
        }
        else if (userChoice.equalsIgnoreCase("Rock") && systemChoice.equals("Scissors")) {
            System.out.println("User wins");
        }
        else if (userChoice.equalsIgnoreCase("Paper") && systemChoice.equals("Rock")) {
            System.out.println("User wins");
        }
        else if (userChoice.equalsIgnoreCase("Scissors") && systemChoice.equals("Paper")) {
            System.out.println("User wins");
        }
        else {
            System.out.println("System wins");
        }

        n.close();
    }
}
