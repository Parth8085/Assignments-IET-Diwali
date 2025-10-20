import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, rev = 0;

        while (temp > 0) {
            int a = temp % 10;
            rev = rev * 10 + a;
            temp = temp / 10;
        }

        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
