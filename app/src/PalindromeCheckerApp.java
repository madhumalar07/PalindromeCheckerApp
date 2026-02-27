import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
