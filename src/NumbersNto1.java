import java.util.Scanner;

public class NumbersNto1  {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >=1; i--) {
            System.out.println(i);

        }
    }
}
/*1. Числата от N до 1 в обратен ред
Напишете програма, която чете цяло положително число n, въведено от потребителя, и печата числата от n
до 1 в обратен ред (от най-голямото към най-малкото).
Примерен вход и изход
вход   изход    вход     изход    вход   изход
2       2         3        3        5      5
        1                  2               4
                           1               3
                                           2
                                           1 */