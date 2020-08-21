//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // get input
        String guest1  = scanner.nextLine();
        String guest2  = scanner.nextLine();
        String guest3  = scanner.nextLine();
        String guest4  = scanner.nextLine();

//        String guest1  = "moe larry curly";
//        String guest2  = "john paul george ringo";
//        String guest3  = "roland kurt";
//        String guest4  = "percy";

        // splt inputs
        String[] g1 = guest1.split(" ");
        String[] g2 = guest2.split(" ");
        String[] g3 = guest3.split(" ");
        String[] g4 = guest4.split(" ");

        displayRevers(g4);
        displayRevers(g3);
        displayRevers(g2);
        displayRevers(g1);
    }

    public static void displayRevers(String[] names) {
        int nameSize = names.length;

        for (int i = nameSize; i > 0; i--) {
            System.out.println(names[i - 1]);
        }

    }
}