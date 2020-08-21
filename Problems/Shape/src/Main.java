import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        run(input);
    }

    public static void run(int input) {
        String output = "You have chosen a ";
        switch (input) {
            case 1:
                output = output + "square";
                break;
            case 2:
                output = output + "circle";
                break;
            case 3:
                output = output + "triangle";
                break;
            case 4:
                output = output + "rhombus";
                break;
            default:
                output = "There is no such shape!";
                break;
        }

        System.out.println(output);
    }
}