import java.util.Scanner;

public class Armstrong_number{
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = 0;
        int temp = number;
        
        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }

        int sum = 0;
        temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            
            int power = 1;
            for (int i = 0; i < numDigits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
