import java.util.*;

public class ReverseA {
    public static void revArray(int number[]){
        int first = 0 , last= number.length-1;

        while(first<last){
           
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;

        }
         
    }
    public static void main(String args[]){
        int num[] = {2,3,4,6,8,10};
        revArray(num);

        //print array
        for(int i =0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

    }
    
}
