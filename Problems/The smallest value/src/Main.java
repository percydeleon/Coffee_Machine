import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int i = 2;

        while (num > fact(i)) {
            i++;
        }

        if (num >= fact(i)) {
            System.out.println(i += 1);
        } else {
            System.out.println(i);
        }
    }
    

    public static long fact(long numero) {
        numero = numero <= 1 ? 1 : numero * fact(numero -1);
        return numero;
    }
}