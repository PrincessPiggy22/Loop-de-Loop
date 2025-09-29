import java.util.Scanner;
import java.time.LocalTime;

public class MenuRep {
    public static Scanner scanner = new Scanner(System.in);

    public static int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {

        System.out.println("   Welcome user!!\n--------------------");
        System.out.println("1: Knock Knock joke\n2: Funny Joke\n3: exit");

        int theChoice = 0;
        do{
            int userChoice = getInput("What would you like to do? ");
            theChoice = userChoice;
            if (userChoice == 1){
                System.out.println("\n-------\n\"Knock Knock\" \n\n\"Come in\"\n--------\n");
            } else if (userChoice == 2) { 
                LocalTime theTime = LocalTime.now();
                System.out.println(theTime);
            }

        } while(theChoice != 3);
        System.out.println("Bye Bye!!");

        scanner.close();
    }


}
