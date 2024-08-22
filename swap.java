import java.util.*;


public class swap {
    public static int[] swap(int a,int b){
        int temp= a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] swapped = swap(a,b);
        System.out.println("After swap: a = " + swapped[0] + ", b = " + swapped[1]);
    }
}
