import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] ar){
        int enteredValue;
        System.out.println("Enter a year:");
        Scanner s = new Scanner(System.in);
        enteredValue = s.nextInt();
        if(enteredValue % 400 == 0 || enteredValue % 4 == 0 && enteredValue % 100 != 0){
            System.out.println("The year "+enteredValue+" is a leap year.");
        }
        else{
            System.out.println("The year "+enteredValue+" is not a leap year.");
        }
    }
}
