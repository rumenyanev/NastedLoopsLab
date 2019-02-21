import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double result = 0;
        for (int i = 0; i <= n; i += 2) {
            result = Math.pow(2, i);
            System.out.printf("%.0f\n", result);

        }

    }
}
/*3. Четни степени на 2
Да се напише програма, която чете число n, въведено от потребителя, и печата четните степени на 2 ≤ 2 n : 2 0 ,
2 2 , 2 4 , 2 8 , …, 2 n .
Примерен вход и изход
вход    изход     вход      изход    вход      изход       вход       изход       вход       изход
3        1         4         1        5         1           6          1           7           1
         4                   4                  4                      4                       4
                             16                16                      16                     16
                                                                       64                     64



 Подсказка: започнете от 1 и в цикъл умножавайте по 4 на всяка стъпка.     */