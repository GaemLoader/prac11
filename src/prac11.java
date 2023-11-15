import java.util.Scanner;

public class prac11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num;

        while ((num = scanner.nextInt()) != 0) {
            if (num == 1) {
                count++;
            }
        }

        System.out.println("The number of ones in the sequence is: " + count);
    }
}