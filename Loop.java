import java.util.Scanner;
public class Loop {
    public static Scanner scanner = new Scanner(System.in);
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int Choice;
        do {
            Choice = getIntInput("\n\nGreetings!\nPress 1 for Cat ASCII art!\nPress 2 for Bnnuy ASCII art!\nPress 3 to Die,\nPress anything else to Quit\n");
            switch (Choice) {
                case 1:
                    System.out.println("    /\\_____/\\\n" +
                            "   /  o   o  \\\n" +
                            "  ( ==  ^  == )\n" +
                            "   )         (\n" +
                            "  (           )\n" +
                            " ( (  )   (  ) )\n" +
                            "(__(__)___(__)__)");
                    break;
                case 2:
                    System.out.println("                              __\n" +
                            "                     /\\    .-\" /\n" +
                            "                    /  ; .'  .' \n" +
                            "                   :   :/  .'   \n" +
                            "                    \\  ;-.'     \n" +
                            "       .--\"\"\"\"--..__/     `.    \n" +
                            "     .'           .'    `o  \\   \n" +
                            "    /                    `   ;  \n" +
                            "   :                  \\      :  \n" +
                            " .-;        -.         `.__.-'  \n" +
                            ":  ;          \\     ,   ;       \n" +
                            "'._:           ;   :   (        \n" +
                            "    \\/  .__    ;    \\   `-.     \n" +
                            "     ;     \"-,/_..--\"`-..__)    \n" +
                            "     '\"\"--.._:");
                    break;
                case 3:
                    System.out.println("      ,-=-.      \n" +
                            "     /  +  \\     \n" +
                            "     | ~~~ |     \n" +
                            "     |R.I.P|     \n" +
                            "\\vV,,|_____|V,VV,,");
                    break;
            }
        }
        while (Choice<=3);
    }
}