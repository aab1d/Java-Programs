import java.util.Scanner;
import java.lang.Math;
public class CheckTypeTriangle {
    static boolean isRight(double x, double y, double z){
        return x + y == z || x + z == y || y + z == x;
    }
    public static void main(String[] ar){
        double s1, s2, s3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle:");
        s1 = s.nextDouble();
        s2 = s.nextDouble();
        s3 = s.nextDouble();

        double sqrS1 = Math.pow(s1, 2);
        double sqrS2 = Math.pow(s2, 2);
        double sqrS3 = Math.pow(s3, 2);

        if(s1 + s2 > s3 || s1 + s3 > s2 || s2 + s3 > s1){
            System.out.println("The triangle is valid.");
            if(s1 == s2 && s1 == s3){
                System.out.println("The triangle is equilateral.");
            }
            else if (s1 == s2 || s2 == s3){
                System.out.println("The triangle is isosceles");
                if(isRight(sqrS1, sqrS2, sqrS3)){
                    System.out.println("The triangle is also right-angled.");
                }
            }
            else{
                System.out.println("The triangle is scalene.");
                if(isRight(sqrS1, sqrS2, sqrS3)){
                    System.out.println("The triangle is also right-angled.");
                }
            }
        }
        else{
            System.out.println("The triangle is NOT valid!");
        }
    }
}