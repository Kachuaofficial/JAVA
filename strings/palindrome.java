package strings;

public class palindrome {

    static void main() {

        String pal = "racecar";

        int start = 0;

        int end = pal.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (pal.charAt(start) != pal.charAt(end)) {

                isPalindrome = false;

                break;

            }

            start++;

            end--;

        }

        if (isPalindrome) {

            System.out.println("palindrome");

        } else {

            System.out.println("Not a palindrome");
        }
    }
}
