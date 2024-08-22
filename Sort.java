import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //Ascending Order Sort
 
        Arrays.sort(arr);
        
        //Descending Order - Reverse the ascending array
        for (int i = 0; i < arr.length / 2; i++) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
