import java.util.Scanner;
public class Looping {
    public static Scanner scanner = new Scanner(System.in);
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int enteredValue = 10;
        int allNumbers = 0;
        while (enteredValue!=0) {
            enteredValue = getIntInput("\nEnter an integer (0 to quit): ");
            allNumbers = allNumbers + enteredValue;
        }
        System.out.println("Total Sum: " + allNumbers);
    }
}