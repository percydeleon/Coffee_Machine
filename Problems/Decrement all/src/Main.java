import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        Integer d = scanner.nextInt();

        System.out.print(--a);
        System.out.print(" " + --b);
        System.out.print(" " + --c);
        System.out.print(" " + --d);
    }
}