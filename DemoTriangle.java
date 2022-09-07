import java.util.Scanner;

class Triangle {
    int a, b, c;
    public Triangle()
    {
        a = 0;
        b = 0;
        c = 0;
    }
    public Triangle(int s1, int s2, int s3)
    {
        a = s1;
        b = s2;
        c = s3;
    }
    public void getSides()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    }
    public int perimeterOfTriangle()
    {
        return a + b + c;
    }
    public double areaOfTriangle()
    {
        double s = (a + b + c) / (double)2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
public class DemoTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getSides();
        int perimeter = t.perimeterOfTriangle();
        double area = t.areaOfTriangle();
        System.out.println("Perimeter = " + perimeter + " Area = " + area);
    }
}