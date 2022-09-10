import java.util.Scanner;
public class LateReturnChargeLibrary {
    public static void main(String[] ar){
        int overdueDayCount;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter extra number of days taken from the due date:");
        overdueDayCount = s.nextInt();
        if(overdueDayCount > 0 && overdueDayCount <= 5){
            System.out.println("The charge for late return if 50 paise.");
        }
        else if(overdueDayCount > 5 && overdueDayCount <= 10){
            System.out.println("The charge for late return is 1 rupee.");
        }
        else if(overdueDayCount > 10){
            System.out.println("The charge for late return is 5 rupees.");
        }
        if(overdueDayCount > 30){
            System.out.println("The book was not returned under 30 days. Your membership has been cancelled!");
        }
    }
}
