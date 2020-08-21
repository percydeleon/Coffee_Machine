import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer num = scanner.nextInt();
        // Integer num = 567;

        if (num > 1000) {
            System.out.println(0);
        } else {
            Integer ones = num % 10;
            Integer tens = num / 10 % 10;
            Integer hunds = num / 100 % 10;
            System.out.println(ones + tens + hunds);
        }
    }
}