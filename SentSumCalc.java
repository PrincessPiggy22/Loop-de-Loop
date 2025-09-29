// Sentinal Sum Calculator

import java.util.Scanner;

public class SentSumCalc {
    public static Scanner scanner = new Scanner(System.in);

    public static int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Program repeatedly prompts the user to enter an integer
        System.out.println("Enter integer's to add them together!!");
        System.out.println("Enter '0' to stop and see your sum \n");
        int total = 0;
        while (true){
            int userNum = getInput("Enter a integer: ");

            if (userNum == 0){ // Loop ends when the user enters 0
                break;
            } else {
                total += userNum; // Program should keep total of all numbers entered
            }
        }
        // After loop ends, display total sum
        System.out.println("Your sum is: " + total);

        scanner.close();
    }
}
