package leetcode;

public class digitsNum {
    public static void revNum(int num) {
        // Reverse the number to extract digits in the correct order
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        // Extract digits from reversed number
        while (rev > 0) {
            int digit = rev % 10;
            System.out.println(digit);
            rev /= 10;
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        revNum(number);
    }

}
