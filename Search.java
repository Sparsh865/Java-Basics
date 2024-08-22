import java.util.*;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        int search = sc.nextInt();
        boolean flag = false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                flag=true;
                index=i;
                break;
            }
        }
        if(flag){
                System.out.println("Found at Index: "+ index);
        }
        else{
                System.out.println("Not Found");
            }
    }
}
