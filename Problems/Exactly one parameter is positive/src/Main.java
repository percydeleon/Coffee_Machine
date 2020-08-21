import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean aMoreZero = false;
        boolean bMoreZero = false;
        boolean cMoreZero = false;


        if  (a > 0) {
            aMoreZero = true;
        }

        if (b > 0) {
            bMoreZero = true;
        }

        if (c > 0) {
            cMoreZero = true;
        }

//        System.out.println("a > 0 : " + a_more_zero);
//        System.out.println("b > 0 : " + b_more_zero);
//        System.out.println("c > 0 : " + c_more_zero);

//        if ((a_less_zero && b_less_zero) && !c_less_zero) {
        if (aMoreZero && bMoreZero && cMoreZero) {
            System.out.println(false);
        } else if ((aMoreZero ^ bMoreZero) ^ cMoreZero) {
            System.out.println(true);
//        } else if ((b_less_zero && c_less_zero) && !a_less_zero) {
        } else if ((bMoreZero ^ cMoreZero) ^ aMoreZero) {
            System.out.println(true);
//        } else if ((a_less_zero && c_less_zero) && !b_less_zero) {
        } else if ((aMoreZero ^ cMoreZero) ^ bMoreZero) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    // better solution
    //    public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //        int a = scanner.nextInt();
    //        int b = scanner.nextInt();
    //        int c = scanner.nextInt();
    //        boolean onlyA = a > 0 && b <= 0 && c <= 0;
    //        boolean onlyB = a <= 0 && b > 0 && c <= 0;
    //        boolean onlyC = a <= 0 && b <= 0 && c > 0;
    //        System.out.println(onlyA || onlyB || onlyC);
    //        // put your code here
    //    }
}