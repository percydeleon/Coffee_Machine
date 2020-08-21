import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int costFoodPerDay = scanner.nextInt() * duration;
        int costOneWayTicket = scanner.nextInt() * 2;
        int costAccomodation = scanner.nextInt() * (duration - 1);
        int totalCost = costFoodPerDay + costOneWayTicket + costAccomodation;

        System.out.println(totalCost);

    }
}

// 210 + 100 + 240