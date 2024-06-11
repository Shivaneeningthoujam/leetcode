package leetcode;

public class happyNum {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        // We used do-while loop instead of while bcz the pointers slow and fast will be
        // equal and the
        // loop wont run
        do {
            slow = square(slow);
            fast = square(square(fast));
            // slow is one step ahead and fast is two step ahead :Floyd's cycle
        } while (slow != fast);
        return slow == 1;
        // returning slow is 1or not .If its 1=>happy else not
    }

    public int square(int num) {
        int ans = 0;
        while (num > 0) {
            int remainder = num % 10;// stores the first digit of the num
            ans += remainder * remainder;// to find the sum of square of the digits
            num /= 10;
        }
        return ans;
    }

}
