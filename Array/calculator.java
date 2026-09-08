//Implement a robust Java calculator program that captures user input dynamically, processes mathematical operations using conditional logic and looping constructs, and ensures efficient error handling. The calculator should allow the user to perform basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus. The program should repeatedly accept user choices until the user selects the exit option. It should also handle invalid inputs and mathematical errors such as division by zero. 
//using swich case and use try and catch for error handling
//without functions

import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = sc.nextInt();
            
            if(choice == 6){
                System.out.println("Exiting the calculator.");
                break;
            }

            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            try {
                switch(choice){
                    case 1:
                        System.out.println("Sum is: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Subtraction is: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Product is: " + (a * b));
                        break;
                    case 4:
                        if(b == 0){
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        System.out.println("Division is: " + ((double)a / b));
                        break;
                    case 5:
                        if(b == 0){
                            throw new ArithmeticException("Modulus by zero is not allowed.");
                        }
                        System.out.println("Modulus is: " + (a % b));
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid operation.");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        sc.close();
    }
}
