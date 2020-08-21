import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        int sum = 0;

        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] % 6 == 0) {
                sum += nums[i];
            }
        }

        System.out.println(sum);
    }
}