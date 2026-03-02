public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "madam";
        int len = input.length();
        boolean found = true;
        for (int i = 0; i < input.length() / 2; i++){
            char ch1 = input.charAt(i);
            char ch2 = input.charAt(len - 1);
            if (ch1 == ch2){
                len -= 1;
            }
            else {
                found = false;
                break;
            }
        }
        System.out.println("Input text: madam\nIs it a Palindrome? : " + found);
    }
}
