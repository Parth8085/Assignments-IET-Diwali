import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        boolean result = CheckPrime(a);
        System.out.println(result);
        sc.close();
    }

    static boolean CheckPrime(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }

}
