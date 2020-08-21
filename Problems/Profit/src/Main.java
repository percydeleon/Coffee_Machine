import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();

        double comp;
        int yr = 1;
        int year = 0;

        while (m < k) {
            comp = m + (m * (p / 100));
            m = comp;
//            System.out.println("Money : " + m + " year : " + yr);
            year = yr;
            yr++;
        }
        System.out.println(year);
    }
}