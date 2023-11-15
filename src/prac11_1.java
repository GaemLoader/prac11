import java.util.Scanner;

    public class prac11_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num;

            while ((num = scanner.nextInt()) != 0) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
    }
