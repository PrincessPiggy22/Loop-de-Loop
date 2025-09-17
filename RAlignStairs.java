import java.util.Scanner;

public class RAlignStairs {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // string concat
        String userChar = getInput("Enter a character: ");
        String oneChar = userChar;
        int rows = getIntInput("Enter number of rows: ");

        int i = 0;
        while (i != rows){
            System.out.printf("%15s\n",userChar);
            i += 1;
            userChar += oneChar;
        }

      scanner.close();
    }
}
