import java.util.*;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        k = k % n; // handle large k

        int[] temp = new int[n];

        // rotate right by k
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
