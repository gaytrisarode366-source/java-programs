import java.util.Scanner;

public class checkVowel {
    public static int Count_Vowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch =(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.next();
        System.out.println("Number of vowels: " + Count_Vowel(str));
    }
}
