package ReverseNumbers;

import java.util.Scanner;



// create class ReverseNumbers 
public class ReverseNumbers {
    public static void main(String[] args){
        try (// take inputs from user
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number:");

            // accept value from user
            int num = sc.nextInt();

            // if user provide 1234, then the reverse or results is 4321

            // use StringBuffer class to reverse numbers
            // it converts numbers into strings 

            StringBuffer sb = new StringBuffer(String.valueOf(num));
            StringBuffer rev = sb.reverse();

            System.out.println("Reverse number of " +num + " is " + rev);
        }
    }
}