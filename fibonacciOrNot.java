import java.util.*;

public class fibonacciOrNot {

    public static int isFibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int index = 1;

        int firstNumber = 0;
        int secondNumber = 1;

        while(secondNumber<n){
            int thirdNumber = firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=thirdNumber;
            index++;
        }
        if(secondNumber==n){
            return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = isFibonacci(num);
        if(index==-1){
            System.out.println("Not Fibonacci Number");
        }
        else{
            System.out.println("Fibonacci Number at Index:" + index);

        }
    }
}
