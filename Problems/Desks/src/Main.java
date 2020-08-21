import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        int total = tables(group1) + tables(group2) + tables(group3);

        System.out.println(total);
    }

    public static int tables(int countStudents) {
        return countStudents / 2 + countStudents % 2;
    }
}