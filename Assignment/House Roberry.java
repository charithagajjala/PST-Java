import java.util.Scanner;

class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of houses
        int[] arr = new int[n];

        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int prev = 0;
        int prev2 = 0;

        for (int i = 0; i < n; i++) {
            int take = arr[i] + prev2;
            int skip = prev;

            int current = Math.max(take, skip);

            prev2 = prev;
            prev = current;
        }

        System.out.println(prev);
        sc.close();
    }
}