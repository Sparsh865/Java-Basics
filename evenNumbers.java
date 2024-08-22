import java.util.*;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        //Two Variations could be 
        //First Sum of first n even numbers
        // int i=1;
        // while(n>0){
        //     if(i%2==0){
        //         sum+=i;
        //         n--;
        //     }
        //     i++;
        // }
        // System.out.println(sum);

        //Second Variation sum of even number till n
        for(int i=1;i<n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
