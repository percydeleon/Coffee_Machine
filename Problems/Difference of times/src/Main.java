import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer hr1 = scanner.nextInt();
        Integer min1 = scanner.nextInt();
        Integer sec1 = scanner.nextInt();
        Integer hr2 = scanner.nextInt();
        Integer min2 = scanner.nextInt();
        Integer sec2 = scanner.nextInt();

        Integer ts1 = hr1 * 60 * 60 + min1 * 60 + sec1;
        Integer ts2 = hr2 * 60 * 60 + min2 * 60 + sec2;

        System.out.println(ts2 - ts1);
    }
}