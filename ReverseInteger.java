import java.util.Scanner;

public class ReverseInteger {
    public int reverse(int x) {
        long r = 0;
        long n = (long) x;

        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");

        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            ReverseInteger solution = new ReverseInteger();
            int result = solution.reverse(input);
            System.out.println("Reversed Integer: " + result);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
