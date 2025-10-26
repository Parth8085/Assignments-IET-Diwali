import java.util.*;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements for first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements for second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n2) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        System.out.println("Merged Sorted Array:");
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }
    }
}
