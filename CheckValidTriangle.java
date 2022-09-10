import java.util.Scanner;
public class CheckValidTriangle {
    public static void main(String[] ar){
        int s1, s2, s3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle:");
        s1 = s.nextInt();
        s2 = s.nextInt();
        s3 = s.nextInt();

        if(s1 + s2 > s3 || s1 + s3 > s2 || s2 + s3 > s1){
            System.out.println("The triangle is valid.");
        }
        else{
            System.out.println("The triangle is NOT valid!");
        }
    }
}
