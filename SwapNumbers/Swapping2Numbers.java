// create Java class
public class Swapping2Numbers {
    public static void main(String[] args) {
        // define variables
        int a = 10, b = 20;

        // print variables before swapping
        System.out.println("\n Before swapping values are: \n a: " +a+ " b: " +b);

        // Logic1 - using Thrid variable
        int t = a;
        a = b;
        b = t;

        // print variables after swapping
        System.out.println("\n After swapping values are: \n a: " +a+ "\n b: " +b);
    }
}


// swap numbers without using thrid variable
 // int a = 10, b= 20;
 // a = a + b;
 // b = a - b;
 // a = a - b; 
