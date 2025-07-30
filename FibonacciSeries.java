import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (positive integer): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number of terms.");
        } else if (n == 1) {
            System.out.println("Fibonacci series: 0");
        } else {
            System.out.print("Fibonacci series: ");
            long first = 0, second = 1;
            System.out.print(first + " " + second);
            
            int count = 2;
            while (count < n) {
                long next = first + second;
                System.out.print(" " + next);
                first = second;
                second = next;
                count++;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}