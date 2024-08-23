import java.util.*;
public class MisingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
            //Isme Array continous hoga like {1,2,4,5,6} so 3 missing hoga
        }
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int arraySum=0;
        for(int num:arr){
            arraySum += num;
        } 
        int mNumber = totalSum-arraySum;
        System.out.println(mNumber);
    }
}
