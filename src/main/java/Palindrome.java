package main.java;

public class Palindrome {

    public static int isPalindrome(String str) {

        String str1 = str.toLowerCase()
                .replace(" ", "")
                .replaceAll("[^a-zA-Z ]", "");

        if (str1.isEmpty()) {
            return 0;
        }
        int length = str1.length();
        for (int i = 0; i < length / 2; i++) {
            if (str1.charAt(i) != str1.charAt((str1.length() -1) -i)) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isPalindrome1(String str) {

        String str1 = str.toLowerCase()
                         .replace(" ", "")
                         .replaceAll("[^a-zA-Z ]", "");

        if (str1.isEmpty()) {
            return false;
        }
        int length = str1.length();
        for (int i = 0; i < length / 2; i++) {
            if (str1.charAt(i) != str1.charAt((str1.length() -1) -i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String string1 = "Madam";
        String string2 = "nurses run";
        String string3 = "nurses: run;";
        String string4 = " ";

        System.out.println(isPalindrome(string1));
        System.out.println(isPalindrome(string2));
        System.out.println(isPalindrome(string3));
        System.out.println(isPalindrome(string4));

        System.out.println(isPalindrome1(string1));
        System.out.println(isPalindrome1(string2));
        System.out.println(isPalindrome1(string3));
        System.out.println(isPalindrome1(string4));
    }
}
