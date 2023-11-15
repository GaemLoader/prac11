import java.util.Scanner;

        public class prac11_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num;
            int position = 1;

            while ((num = scanner.nextInt()) != 0) {
                if (position % 2 != 0) {
                    System.out.println(num);
                }
                position++;
            }
        }
    }
