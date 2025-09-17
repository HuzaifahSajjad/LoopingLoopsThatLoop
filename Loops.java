public class Loops {
    public static void main(String[] args) {
        String currentLine = "";
        while (!currentLine.equals("12345678910")) {
            int nextNumber = 0;
            while (nextNumber!=10) {
                nextNumber++;
                String strNumber = Integer.toString(nextNumber);
                currentLine = currentLine + strNumber;
                System.out.println(currentLine);
            }
        }
    }
}