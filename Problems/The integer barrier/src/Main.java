import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
        int input;
        int total = 0;


        for (int i = 0; i < 5; i++) {
            input = scanner.nextInt();
            total = total + input;

            if (total >= 1000) {
                total -= 1000;
                break;
            } else {
                if (input == 0) {
                    break;
                }
            }
//
//            if (input == 0) {
//                break;
//            } else {
//                if (total >= 1000) {
//                    total = total - 1000;
//                }
//            }
        }

        System.out.println(total);

//        while (scanner.hasNext() == true) {
//            input = scanner.nextInt();
////            System.out.println(input);
//            total = total + input;
//            if (input == 0){
//                break;
//            } else {
//                if (total > 1000) {
//                    total = total - 1000;
//                }
//            }
//        }
    }
}