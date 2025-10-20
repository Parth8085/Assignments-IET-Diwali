import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rem, rev = 0;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed number is: " + rev);
        sc.close();
    }
}
