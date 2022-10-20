abstract class Shape {
    int a, b, c;
    abstract void displayShape();
    abstract void AreaOfShape();
    void display() {
        System.out.println("Inside Shape's method");
    }
}
class Triangular extends Shape {
    void getSides(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }
    double s = (a + b + c) / 2.0;
    double area =  Math.sqrt(s * (s - a) * (s - b) * (s - a));
    void displayShape() {
        System.out.println("The shape is triangular.");
    }
    void AreaOfShape() {
        System.out.println("Area of triangular shape is: "+ area);
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        Triangular t = new Triangular();
        t.getSides(3, 4, 5);
        t.displayShape();
        t.AreaOfShape();
        t.display(); // from superclass
    }
}
