import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int newNumber=0;
        while(temp>0){
            int rem = temp%10;
            newNumber = (newNumber*10)+rem;
            temp=temp/10;
        }
        if(n==newNumber){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
