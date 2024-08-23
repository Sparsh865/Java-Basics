import java.util.*;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        int count=1;
        int majorityElement = -1;
        for(int i=1;i<arr.length;i++){
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1; // Reset count for a new element
            }

            // Check if the current element is the majority element
            if (count > arr.length / 2) {
                majorityElement = arr[i];
                break;
            }
        }
        System.out.println(majorityElement);
    }
}
