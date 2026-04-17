import java.util.Scanner;

class AbsoluteDifference {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int left_sum = 0;
        int total_sum = 0;
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            total_sum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            int right_sum = total_sum - nums[i] - left_sum;
            result[i] = nums[i] * i - left_sum + right_sum - nums[i] * (n - i - 1);
            left_sum += nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        AbsoluteDifference obj = new AbsoluteDifference();
        int[] result = obj.getSumAbsoluteDifferences(nums);

        System.out.println("Sum of absolute differences array:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
