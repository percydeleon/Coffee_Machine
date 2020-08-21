import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i]  = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int ctr = countInt(nums, n);
        System.out.println(ctr);
    }

    static int countInt(int[] haystack, int needle) {
        int ctr = 0;

//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] == needle) {
//                ctr++;
//            }
//        }

        for (int i : haystack) {
            if (i == needle) {
                ctr++;
            }
        }

        return ctr;
    }
}