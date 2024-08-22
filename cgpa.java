
import java.util.*;

public class cgpa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        double totalMarks = 0;

        for(int i=1;i<=subjects;i++){
            System.out.println("Enter marks for subject "+i);
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double cgpa = (totalMarks/(subjects*100))*10;
        System.out.println(cgpa);

    }
}