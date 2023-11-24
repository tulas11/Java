//Create a class ComplexNumber with data members real, imaginary. 
//Add the display function. 
//Create the object of this class in main method and invoke all the methods in that class.

package package21;
public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructors
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Display method
    public void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        // Create an instance of the ComplexNumber class
        ComplexNumber complex1 = new ComplexNumber();
        ComplexNumber complex2 = new ComplexNumber(3.5, 2.0);

        // Invoke the display method to show complex numbers
        System.out.println("Complex Number 1:");
        complex1.display();

        System.out.println("\nComplex Number 2:");
        complex2.display();
    }
}
