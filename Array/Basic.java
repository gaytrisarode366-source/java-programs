import java.util.*;
public class Basic{
    public static void main(String args[]){

        //creating an array
        int numbers[] = {2,3,4,1};
        System.out.println(numbers[0]);

        //input output of array
        int marks[] = new int[50];//type of array is static so do not store 51 or 60 marks
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks :");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry marks :");
        marks[1] = sc.nextInt();
        System.out.print("Enter Math marks :");
        marks[2] = sc.nextInt();

        System.out.println("Physics :"+marks[0]);
        System.out.println("Chemistry :"+marks[1]);
        System.out.println("Math :"+marks[2]);

        //calculate percentage
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Average of marks is:"+percentage);

        //length of array
        System.out.println("length of array :"+ marks.length);




    }
}
