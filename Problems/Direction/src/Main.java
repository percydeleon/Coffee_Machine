import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int dir = scanner.nextInt();
        String dirWord = new String();

        switch (dir) {
            case 1:
                dirWord = "move up";
                break;
            case 2:
                dirWord = "move down";
                break;
            case 3:
                dirWord = "move left";
                break;
            case 4:
                dirWord = "move right";
                break;
            case 0:
                dirWord = "do not move";
                break;
            default:
                dirWord = "error!";
                break;
        }

        System.out.println(dirWord);
    }
}