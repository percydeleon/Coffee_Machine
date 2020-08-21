import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String nums = s.nextLine();
        String[] arrStr = nums.split(" ");
        int shift = s.nextInt();

        int len = arrStr.length;

        int[] arrInt = new int[len];

        for (int a = 0; a < len; a++) {
            arrInt[a] = Integer.parseInt(arrStr[a]);
        }

        rotate(arrInt, shift);
    }

    /**
     * https://www.programcreek.com/2015/03/rotate-array-in-java/
     * @param nums
     * @param k
     */
    static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        int j = 0;

        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;

        }

//        System.arraycopy(result, 0, nums, 0, nums.length);
//        System.out.println(Arrays.toString(result));

        for (int a = 0; a < result.length; a++) {
            System.out.print(result[a] + " ");
        }
    }
}