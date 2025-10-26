import java.util.*;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isAlphanumeric = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9'))) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric)
            System.out.println("The string is alphanumeric.");
        else
            System.out.println("The string contains non-alphanumeric characters.");
    }
}
