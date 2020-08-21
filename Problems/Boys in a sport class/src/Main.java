import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        run(h1, h2, h3);

//        run(1,2,3);
//        run(1,2,2);
//        run(2,2,1);
//        run(2,2,3);
//        run(3,2,1);
//        run(3,2,2);
//        run(2,2,2);
//        run(2,3,2);
//        run (165,161,158);

    }


    static void run(int h1, int h2, int h3) {
        if ((h1 <= h2  && h2 <= h3) || (h3 <= h2 && h2 <= h1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}