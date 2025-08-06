abstract class Shape {
    abstract void volume();
    abstract void surfaceArea();
}
// Sphere class
class Sphere extends Shape {
    double radius;
    Sphere(double r) {
        radius = r;
    }
    void volume() {
        double v = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Sphere Volume: " + v);
    }
    void surfaceArea() {
        double a = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Surface Area: " + a);
    }
}
// Hemisphere class
class Hemisphere extends Shape {
    double radius;
    Hemisphere(double r) {
        radius = r;
    }
    void volume() {
        double v = (2.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Hemisphere Volume: " + v);
    }
    void surfaceArea() {
        double a = 3 * Math.PI * radius * radius;
        System.out.println("Hemisphere Surface Area: " + a);
    }
}
// Cylinder class
class Cylinder extends Shape {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    void volume() {
        double v = Math.PI * radius * radius * height;
        System.out.println("Cylinder Volume: " + v);
    }
    void surfaceArea() {
        double a = 2 * Math.PI * radius * (radius + height);
        System.out.println("Cylinder Surface Area: " + a);
    }
}
// Cone class
class Cone extends Shape {
    double radius, height;
    Cone(double r, double h) {
        radius = r;
        height = h;
    }
    void volume() {
        double v = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Cone Volume: " + v);
    }
    void surfaceArea() {
        double l = Math.sqrt(radius * radius + height * height); // slant height
        double a = Math.PI * radius * (radius + l);
        System.out.println("Cone Surface Area: " + a);
    }
}
public class ShapesTest {
    public static void main(String[] args) {
        Shape shape;
        shape = new Sphere(5);
        shape.volume();
        shape.surfaceArea();
        shape = new Hemisphere(5);
        shape.volume();
        shape.surfaceArea();
        shape = new Cylinder(5, 10);
        shape.volume();
        shape.surfaceArea();
        shape = new Cone(5, 10);
        shape.volume();
        shape.surfaceArea();
    }
}