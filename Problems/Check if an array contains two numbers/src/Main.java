import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        testArray();
    }

    static void testArray() {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] nums = new int[len];

        for (int i = 0; i  < len; i++) {
            nums[i] = s.nextInt();
        }

        int n = s.nextInt();
        int m = s.nextInt();
        boolean occurs = false;

        for (int j = 1; j < nums.length; j++) {
            if  (nums[j] == m && nums[j - 1] == n || nums[j] == n && nums[j - 1] == m) {
                occurs = true;
                break;
            }
        }

        System.out.println(occurs);
    }
}