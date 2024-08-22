import java.util.*;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("The number must be a 4-digit number.");
        } else {
            
            int[] arr = new int[4];
            for (int i = 3; i >= 0; i--) {
                arr[i] = num % 10; 
                arr[i] = (arr[i] + 1) % 10; 
                num = num / 10; 
            }

            int newNumber = 0; 

            for (int i = 0; i < arr.length; i++) {
                newNumber = (newNumber * 10) + arr[i];
            }
            System.out.println(newNumber);
        }
    }
}
