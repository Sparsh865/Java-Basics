import java.util.*;

public class IncomeTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        double tax;
        if(basic>250000 && basic <=500000){
            tax = 0.05*basic;
        }
        else if (basic > 500000 && basic <=1000000) {
            tax = 0.2 * basic;
        }
        else if (basic > 1000000) {
            tax = 0.3 * basic;
        }
        else  {
            tax = 0;
        }
        int incometax = (int)tax;
        System.out.println(tax);
        sc.close();
    }
}
