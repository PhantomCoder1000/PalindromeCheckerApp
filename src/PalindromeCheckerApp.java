public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right){
            if (normalized.charAt(left) != normalized.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}