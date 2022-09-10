import java.util.Scanner;
public class SteelGrading {
    public static void main(String[] ar){
        final int  MAX_HARD = 50;
        final double MIN_C_CONTENT = 0.7;
        final int MAX_TENSILE_STR = 5600;

        int hardness;
        double carbonContent;
        int tensileStrength;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter hardness of steel:");
        hardness = s.nextInt();
        System.out.println("Enter carbon content in the steel:");
        carbonContent = s.nextDouble();
        System.out.println("Enter tensile strength of the steel:");
        tensileStrength = s.nextInt();

        if(hardness > MAX_HARD && carbonContent < MIN_C_CONTENT && tensileStrength > MAX_TENSILE_STR){
            System.out.println("The steel is Grade 10.");
        }
        else if(hardness > MAX_HARD && carbonContent < MIN_C_CONTENT){
            System.out.println("The steel is Grade 9.");
        }
        else if(carbonContent < MIN_C_CONTENT && tensileStrength > MAX_TENSILE_STR){
            System.out.println("The steel is Grade 8.");
        }
        else if(hardness > MAX_HARD && tensileStrength > MAX_TENSILE_STR){
            System.out.println("The steel is Grade 7.");
        }
        else if(hardness > MAX_HARD || carbonContent < MIN_C_CONTENT || tensileStrength > MAX_TENSILE_STR){
            System.out.println("The steel is Grade 6.");
        }
        else{
            System.out.println("The steel is Grade 5.");
        }
    }
}
