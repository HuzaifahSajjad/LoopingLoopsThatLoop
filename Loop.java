import java.util.Scanner;
import java.time.LocalTime;
public class Loop {
    public static Scanner scanner = new Scanner(System.in);
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int Choice;
        do {
            Choice = getIntInput("\n\nGreetings! I didn't know you hated ASCII art but whatever! Just kidding lol\n1 = say hello\n2 = display current time\n3 = exit\n");
            switch (Choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    LocalTime time = LocalTime.now();
                    System.out.println(time);
                    break;
            }
        }
        while (Choice<=2);
    }
}