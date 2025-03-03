import java.util.Scanner;

public class LongNumberAddition {
    public static void main(String[] args) {
        String num1 = "999999999999";
        String num2 = "444444444444";

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }

        System.out.println("Sum: " + result.reverse().toString());
    }
}