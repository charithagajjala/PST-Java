import java.util.Arrays;

class MoveZeros {

    public void moveZeroes(int[] nums) {
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros solution = new MoveZeros();

        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
