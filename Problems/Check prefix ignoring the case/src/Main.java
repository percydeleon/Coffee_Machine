import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        String newString = in.toLowerCase();

        System.out.println(newString.startsWith("j"));
    }
}