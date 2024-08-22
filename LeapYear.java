import java.util.*;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean flag = false;
        if(year%4==0){
            if (year % 100 != 0 || year % 400 == 0) {
                flag = true;
            }
        }
        
        if(flag){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        }

    }
}
