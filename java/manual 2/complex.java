public class complex {
    int real;
    int imag;

complex(int r, int i) {
        real = r;
        imag = i;
    }
    complex add(complex c) {
        return new complex(this.real + c.real, this.imag + c.imag);
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
    public static void main(String[] args) {
        complex c1 = new complex(4, 5);
        complex c2 = new complex(3, 2);
        complex sum = c1.add(c2);
        System.out.print("Sum of complex numbers: ");
        sum.display();
    }
} 
    

