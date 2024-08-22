import java.util.*;

public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        double aggregateMarks = 0;

        for(int i=1;i<=subjects;i++){
            int marks = sc.nextInt();
            aggregateMarks+=marks;
        }
        int maximumMarks = subjects*100;
        double percentage = (aggregateMarks/maximumMarks)*100;

        System.out.println(percentage);

    }

}
