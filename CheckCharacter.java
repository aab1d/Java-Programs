import java.util.Scanner;
public class CheckCharacter {
    public static void main(String[] ar){
        char enteredChar;
        System.out.println("Enter a character");
        Scanner s = new Scanner(System.in);
        enteredChar = s.next().charAt(0);
        if(enteredChar >= 65 && enteredChar <= 90){
            System.out.println("The entered value is an uppercase letter.");
        }
        else if(enteredChar >= 97 && enteredChar <= 122){
            System.out.println("The entered value is a lowercase letter.");
        }
        else if(enteredChar >= 48 && enteredChar <= 57){
            System.out.println("The entered value is digit(number).");
        }
        else if(enteredChar <= 127){
            System.out.println("The entered value is special character.");
        }
        else{
            System.out.println("The entered value is out of range.");
        }
    }
}
