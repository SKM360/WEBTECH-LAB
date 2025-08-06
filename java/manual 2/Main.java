import Science.Mathematics;
import Science.Physics;
public class Main {
    public static void main(String[] args) {
        System.out.println("Square of 4: " + Mathematics.square(4));
        System.out.println("Cube of 3: " + Mathematics.cube(3));
        System.out.println("Max of 7 and 9: " + Mathematics.max(7, 9));
        System.out.println("Force (mass=10, accel=2): " + Physics.force(10, 2));
        System.out.println("Momentum (mass=5, velocity=6): " + Physics.momentum(5, 6));
    }
}