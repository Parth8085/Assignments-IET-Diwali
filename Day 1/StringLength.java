import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string of your choice: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int len = arr[i].length();
            if (len > maxLength) {
                maxLength = len;
            }
        }
        sc.close();

        System.out.println("The length will be the: " + maxLength);
    }
}
