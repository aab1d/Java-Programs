import java.util.Scanner;
public class CalculateInsurancePremium {
    public static void main(String[] ar){
        int age;
        char goodHealth;
        char cityResident;
        char gender;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter you age:");
        age = s.nextInt();
        System.out.println("Is your health condition good? (uppercase Y for yes)");
        goodHealth = s.next().charAt(0);
        System.out.println("Do you live in a city? (uppercase Y for yes)");
        cityResident = s.next().charAt(0);
        System.out.println("Enter your gender: (uppercase M/F)");
        gender = s.next().charAt(0);

        if(age >= 25 && age <= 35){
            if(goodHealth == 'Y' && cityResident == 'Y'){
                if(gender == 'M'){
                    System.out.println("The premium is Rs. 4 per thousand.");
                    System.out.println("The policy amount cannot exceed Rs. 2 lakh.");
                }
                else if(gender == 'F'){
                    System.out.println("The premium is Rs. 3 per thousand.");
                    System.out.println("The policy amount cannot exceed Rs. 1 lakh.");
                }
                System.out.println("Invalid gender. Try again!");
            }
            else{
                if(gender == 'M'){
                    System.out.println("The premium is Rs. 6 per thousand.");
                    System.out.println("The policy amount cannot exceed Rs. 10,000.");
                }
                else if(gender == 'F'){
                    System.out.println("You are not insured!");
                }
                else{
                    System.out.println("Invalid gender. Try again!");
                }
            }
        }
        else{
            System.out.println("You are not insured!");
        }
    }
}
