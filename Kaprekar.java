import java.util.*;

public class Kaprekar {

    public static int length(int a){
        int count=0;
        while(a>0){
            count++;
            a=a/10;
        }
        return count;
    }
    public static boolean isKaprekar(int n){

        int squared_number = n*n;
        int noOfDigits = length(n);
        int divisor =  (int)Math.pow(10, noOfDigits);
        int leftPart = squared_number/divisor;
        int rightPart = squared_number%divisor;
        if(rightPart==0){
            return false;
        }
        if(leftPart+rightPart==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isKaprekar(num)){
            System.out.println("Kaprekar");
        }
        else{
            System.out.println("Not Kaprekar");
        }
    }
}
