import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        try {
            System.out.println(in.substring(in.length() - 4).equals("burg"));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(false);
        }
    }
}