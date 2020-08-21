import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        Integer n = scanner.nextInt();
        Integer o = ((n + 1) * n + 2) * n + 3;
        System.out.println(o);


    }
}