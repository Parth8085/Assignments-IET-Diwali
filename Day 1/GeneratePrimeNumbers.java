import java.util.Scanner;

public class GeneratePrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no.: ");
        int n = sc.nextInt();

        System.out.println(n);

        for (int i = 2; i <= n; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
