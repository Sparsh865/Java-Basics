import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNumber = 0;
        int secondNumber=1;
        System.out.print(firstNumber+" "+secondNumber+" ");

        for(int i=3;i<=n;i++){
            int thirdTerm = firstNumber+secondNumber;
            System.out.print(thirdTerm+" ");
            firstNumber=secondNumber;
            secondNumber=thirdTerm;
        }
        

    }
}
