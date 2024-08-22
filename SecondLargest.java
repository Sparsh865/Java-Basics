import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // int max = Integer.MIN_VALUE;
        // int smax = Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         smax = max;
        //         max=arr[i];
        //     }
        //     else if(arr[i]>smax && arr[i]<max){
        //         smax = arr[i];
        //     }
        // }
        Arrays.sort(arr);
        int smax = arr[arr.length - 2];

        System.out.println("SMax: " + smax);

    }
}
