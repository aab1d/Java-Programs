class A {
    void display() {
        System.out.println("Inside A's method");
    }
}
class B extends A {
    void display() {
        System.out.println("Inside B's method");
    }
}
class C extends A {
    void display() {
        System.out.println("Inside C's method");
    }
}
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;

        r = a;
        r.display();
        r = b;
        r.display();
        r = c;
        r.display();
    }
}
