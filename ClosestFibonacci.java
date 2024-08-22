import java.util.Scanner;

public class ClosestFibonacci {
    public static int isFibonacci(int n) {
        if (n < 0) {
            return 0; // Handle negative numbers, next Fibonacci is 0
        }

        int firstNumber = 0;
        int secondNumber = 1;

        while (secondNumber <= n) {
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        return secondNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int closest = isFibonacci(num);
        System.out.println("Closest: "+closest);
        

        
    }
}
