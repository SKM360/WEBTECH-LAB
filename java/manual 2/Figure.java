class Figure {
    double dim1, dim2;

    // Constructor for square
    Figure(double side) {
        dim1 = dim2 = side;
    }

    // Constructor for rectangle
    Figure(double length, double breadth) {
        dim1 = length;
        dim2 = breadth;
    }

    double area() {
        return dim1 * dim2;
    }

    double perimeter() {
        return 2 * (dim1 + dim2);
    }

    public static void main(String[] args) {
        Figure square = new Figure(5); // square with side 5
        Figure rectangle = new Figure(4, 6); // rectangle with length 4 and breadth 6
        System.out.println("Square - Area: " + square.area() + ", Perimeter: " + square.perimeter());
        System.out.println("Rectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
    }
}