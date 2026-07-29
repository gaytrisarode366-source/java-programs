import java.util.*;
public class Paires{
    public static void printPaires(int numbers[]){
        int tp = 0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];

            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total paires"+tp);
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,9};
        printPaires(num);
    }
}