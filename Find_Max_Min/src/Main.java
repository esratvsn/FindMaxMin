import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kac tane sayı gireceksiniz?: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen gecerli sayı giriniz!");
            return;
        }
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        int number = input.nextInt();
        int max = number;
        int min = number;

        for (int i = 2; i <= n; i++) {
            System.out.println(i + ".sayıyı giriniz: ");
            number = input.nextInt();
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }
        System.out.println("En büyüğü: " + max);
        System.out.println("En küçüğü: " + min);

    }
}