import java.util.*;

public class Rotate {
    public static void leftRotate(int[] arr,int rotations){
        int n = arr.length;
        rotations=rotations%n; //example 2

        int[] temp = new int[rotations];
        // arr = {1,2,3,4,5} temp = {}        
        System.arraycopy(arr,0,temp,0,rotations);
        //arr={1,2,3,4,5} temp={1,2}
        System.arraycopy(arr,rotations,arr,0,n-rotations);
        //arr{3,4,5,4,5} temp={1,2};
        System.arraycopy(temp,0,arr,n-rotations,rotations);
        // arr{3,4,5,1,2} temp={1,2};
    }

    public static void rightRotate(int[] arr,int rotations){
        int n= arr.length;
        rotations=rotations%n; //example 2
        //result arr={4,5,1,2,3}
        
        int[] temp = new int[rotations];
        // arr = {1,2,3,4,5} temp = {}
        System.arraycopy(arr, n - rotations, temp, 0, rotations);
        //arr={1,2,3,4,5} temp={4,5}
        // Step 2: Shift the remaining elements of arr to the right
        System.arraycopy(arr, 0, arr, rotations, n - rotations);
        //arr={1,2,1,2,3} temp={4,5}
        // Step 3: Copy the elements from temp to the beginning of arr
        System.arraycopy(temp, 0, arr, 0, rotations);
        //arr={4,5,1,2,3} temp={4,5}

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int rotations = sc.nextInt();

        rightRotate(arr,rotations);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
