import java.util.*;


public class ass2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Enter the first number:");
            int a = sc.nextInt();
            System.out.print("Enter the second number:");
            int b = sc.nextInt();

            System.out.print("Enter the operation(+,-,*,/):");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':System.out.println("a+b :"+(a+b));
                    break;

                case '-':System.out.println("a-b :"+(a-b));
                    break;    
            
                case '*':System.out.println("a*b :"+(a*b));
                break;

                case '/':System.out.println("a/b :"+(a/b));
                    break;
                default:System.out.println("not a valid operator");
                    break;
        
                }
            }
            catch (Exception e) {
                System.out.println("not a ");
               
            }  
                       



    }

    }
    
    

