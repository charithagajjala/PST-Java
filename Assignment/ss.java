import java.util.*;

class Solution {
    public static String findSpecialty(String input) {

        String[] arr = input.split(",");

        int pCount = 0, oCount = 0, eCount = 0;

        // Count occurrences
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i].equals("P")) {
                pCount++;
            } else if (arr[i].equals("O")) {
                oCount++;
            } else if (arr[i].equals("E")) {
                eCount++;
            }
        }

        // Decide after counting
        if (pCount > oCount && pCount > eCount) {
            return "Pediatrics";
        } else if (oCount > pCount && oCount > eCount) {
            return "Orthopedics";
        } else {
            return "ENT";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(findSpecialty(input));
        sc.close();
    }
}