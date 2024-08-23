import java.util.*;

public class KaprekarLimit {
    public static int length(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static boolean isKaprekar(int n){
        int squared_number = n*n;
        int divisor = (int) Math.pow(10,length(n));

        int leftPart = squared_number/divisor;
        int rightPart = squared_number%divisor;

        if(rightPart==0){
            return false;
        }
        if(leftPart+rightPart!=n){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        for(int i=p;i<q;i++){
            if(isKaprekar(i)){
                System.out.print(i+" ");
            }
        }
    }
}
