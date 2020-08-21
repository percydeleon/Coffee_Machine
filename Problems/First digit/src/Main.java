import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Integer tens = scanner.nextInt();

        if (tens > 99) {
            System.out.println(0);
        } else {
            System.out.println((tens / 10) % 10);
        }
    }
}