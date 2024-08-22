import java.util.*;

public class pass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        double totalMarks = 0;
        int maxMarks = subjects*100;
        boolean flag = true;
        for(int i=1;i<=subjects;i++){
            int marks = sc.nextInt();
            if(marks<33){
                flag = false;
                break;
            }
            totalMarks+=marks;
        }
        double percentage = (totalMarks/maxMarks)*100;
        if(percentage<40){
            flag=false;
        }

        if(flag){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}
