import java.util.Scanner;
public class That {
    public static Scanner scanner = new Scanner(System.in);
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        String stairMaterial = getInput("Enter a character: ");
        int stairHeight = getIntInput("Enter number of levels: ");
        stairHeight++;
        int i;
        for (i=1; i<stairHeight; i++) {
            String stairQuantity = stairMaterial.repeat(i);
            System.out.printf("%"+stairHeight+"s", stairQuantity+"\n");
        }
    }
}