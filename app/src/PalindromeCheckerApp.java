import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Stack<Character> stack = new Stack<Character>();

                System.out.println("Palindrome Checker App");
                System.out.println("UC5: Stack-Based Palindrome Checker");

                System.out.print("Enter a string: ");
                String input = sc.nextLine();


                for (int i = 0; i < input.length(); i++) {
                    stack.push(input.charAt(i));
                }

                String reversed = "";


                while (!stack.isEmpty()) {
                    reversed = reversed + stack.pop();
                }


                if (input.equals(reversed)) {
                    System.out.println("The string is a Palindrome");
                } else {
                    System.out.println("The string is NOT a Palindrome");
                }

                sc.close();
            }
        }