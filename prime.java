import java.util.*;

public class prime {
    public static boolean isPrime(int a){
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n==1 || n==0){
            System.out.println("Non Prime");
        }
        else if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Non Prime");

        }
        
    }
}
