import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int distancePerDay = scanner.nextInt();
        int distancePerNight = scanner.nextInt();

        int modulo = (height - distancePerNight) % (distancePerDay - distancePerNight);
        int days = (height - distancePerNight) / (distancePerDay - distancePerNight);

        if (modulo > 0) {
            days++;
        }

        System.out.println(days);
    }
}