import java.util.Scanner;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of strings ");
        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];
        int max = 0;

        System.out.println("Enter string-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].length() > max) {
                max = arr[i].length();
            }
        }

        System.out.println("Longest string length = " + max);
        sc.close();
    }
}
