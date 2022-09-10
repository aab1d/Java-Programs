import java.util.Scanner;

public class DegreeResultDeclaration {
    public static void main(String[] ar){
        int marksMain;
        int marksSub;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for main (A) subject (from 50):");
        marksMain = s.nextInt();
        System.out.println("Enter marks for subsidiary (B) subject (from 50)");
        marksSub = s.nextInt();

        double percentageMain = (marksMain / 50.0) * 100;
        double percentageSub = (marksSub / 50.0) * 100;

        if(percentageMain >= 55 && percentageSub >= 45){
            System.out.println("Passed!");
        }
        else if(percentageMain >= 45 && percentageSub >= 55){
            System.out.println("Passed!");
        }
        else if(percentageMain >= 65 && percentageSub <= 45){
            System.out.println("Need to re-appear in examination for subsidiary subject (B) only!");
        }
        else{
            System.out.println("Failed!");
        }
    }
}
