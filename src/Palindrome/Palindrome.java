package Palindrome;



    public class Palindrome {
        public static void main(String[] args) {
            String str = "madam";
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }

        public static boolean isPalindrome(String str) {
            String modifiedStr = str.toLowerCase();
            int left = 0;
            int right = modifiedStr.length() - 1;

            while (left < right) {
                if (modifiedStr.charAt(left) != modifiedStr.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

