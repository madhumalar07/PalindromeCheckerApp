import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            System.out.println("Palindrome Checker App");
            System.out.println("UC6: Queue + Stack Based Palindrome Check");

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Enqueue and Push characters
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                queue.add(ch);     // enqueue
                stack.push(ch);    // push
            }

            boolean isPalindrome = true;

            // Compare dequeue and pop
            while (!queue.isEmpty()) {
                if (queue.remove() != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Result
            if (isPalindrome) {
                System.out.println("The string is a Palindrome");
            } else {
                System.out.println("The string is NOT a Palindrome");
            }

            sc.close();
        }
    }