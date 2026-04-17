import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

class Solutiow {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> ns = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];

            if (!ns.add(v)) {
                return true;
            }

            if (ns.size() > k) {
                ns.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result);

        sc.close();
    }
}
