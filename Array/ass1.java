import java.util.*;
public class ass1 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;   
    }    
    public static int Pro(int a,int b){
        return a*b;      

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println("sum is :"+ result);

        System.out.println("***");

        int re_sub = sub(a, b);
        System.out.println("sub is :"+ re_sub);

        int re_pro = Pro(a, b);
        System.out.println("Product is :"+ re_pro);
        sc.close();
    }
}    
    


