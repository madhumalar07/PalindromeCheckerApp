import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


public class PalindromeCheckerApp {

     public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Deque<Character> deque = new ArrayDeque<>();

                System.out.println("Palindrome Checker App");
                System.out.println("UC7: Deque-Based Optimized Palindrome Checker");

                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                // Insert characters into deque
                for (int i = 0; i < input.length(); i++) {
                    deque.addLast(input.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare first and last characters
                while (deque.size() > 1) {
                    char first = deque.removeFirst();
                    char last = deque.removeLast();

                    if (first != last) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display result
                if (isPalindrome) {
                    System.out.println("The string is a Palindrome");
                } else {
                    System.out.println("The string is NOT a Palindrome");
                }

                sc.close();
            }
        }