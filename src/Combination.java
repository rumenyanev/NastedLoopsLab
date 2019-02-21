import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n ; j++) {
                for (int k = 0; k <= n ; k++) {
                    for (int l = 0; l <= n ; l++) {
                        for (int m = 0; m <= n ; m++) {
                            if (i + j + k +l +m == n){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

/*5. Комбинации
Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има
уравнението:
x1 + x2 + x3 + x4 + x5 = n
Числото n е цяло число и се въвежда от конзолата.
Тествайте решението си в judge системата: https://judge.softuni.bg/Contests/Compete/Index/1016#4
Примерен вход и изход
Вход   Изход     Вход   Изход      Вход   Изход
25     23751      20    10626       5      126    */