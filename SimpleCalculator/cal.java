package SimpleCalculator;

import java.util.Scanner;

public class cal {
    
    public static void main(String args[]){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n \n Enter first number: ");
            int a = sc.nextInt();
            System.out.println("\n Enter second number: ");
            int b = sc.nextInt();
            System.out.println("\n Enter the correct number of the command from following set \n 1 - Addition\n 2 - Susbstraction \n 3 - Multiplication\n 4 - Division \n 5 - Module");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    System.out.println( a + " + " + b + " = " + (a+b));
                    break;
                case 2:
                    System.out.println( a + " - " + b + " = " + (a-b));
                    break;
                case 3:
                    System.out.println( a + " x " + b + " = " + (a*b));
                    break;           
                case 4:
                    System.out.println( a + " / " + b + " = " + (a/b));
                    break; 
                case 5:
                    System.out.println( a + " - " + b + " = " + (a%b));
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        
        }

         
    }

