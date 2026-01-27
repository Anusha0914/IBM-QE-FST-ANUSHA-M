import java.util.Random;
import java.util.Scanner;
import java.util.jar.*;

public class rockpaperscissiors {
    
    private static String a;

    public static void main(String args[]){

        Scanner n= new Scanner(System.in);
        System.out.println("Enter Rock, paper or Scissors:  ");
        a = n.nextLine();


                // create random object
        String Rock=new String();
        String Paper = new String();
        String Scissors=new String();
        String[] choices={"Rock", "Paper","Scissors"};
        Random randompick = new Random();


        
            if(a==Rock && randompick==Scissors){
                System.out.println("User wins");
            }
            else if(a==Paper && randompick==Scissors){
                System.out.println("System wins");
            }

            else if(a==Scissors && randompick==Rock){
                System.out.println("System wins");
            }

            else if(a==Rock && randompick==Paper){
                System.out.println("User wins");
            }
            else if(a==Scissors && randompick==Paper){
                System.out.println("User wins");

            }
            else if(a==Paper&& randompick== Rock){
                System.out.println("User wins");
            }

            else
                System.out.println("It's a draw");


        
        }
        
    }

}

    }

}
