import java.util.Scanner;

public class nameWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int maxSum = 0;
        String maxName = "";

        while (!name.equals("STOP")) {
            int sumSymbol = 0;
            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                sumSymbol += symbol;

            }
            if (sumSymbol > maxSum) {
                maxSum = sumSymbol;
                maxName = name;
            }


            name = scanner.nextLine();


        }
        System.out.printf("Winner is %s - %d!",maxName,maxSum);
    }
}
/*7. Война на имена
Напишете програма, която изчислява ASCII стойността на няколко имена, като името с най-голяма
стойност е победител. Стойността на името се изчислява като съберем ASCII стойностите на всички
букви. От конзолата ще се четат имена до получаването на команда "STOP", след което трябва да се
изпише:
"Winner is {името на победителя} – {стойността на името му}!"
Примерен вход и изход
Вход Изход Обяснения
Petar
Georgi
Stanimir
STOP

Winner is Stanimir - 839! Първата буква е P и тя отговаря на 80 в ASCII,

e отговаря на 101,
t отговаря на 116,
а отговаря на 97,
r отговаря на114.
Сумата им е 508.
Продължаваме да правим същите изчисления и за
останалите и полуваме, че името на Stanimir има най-
голяма стойност – 839.

Ivo
Niki
Valio
Konstanti
n
STOP

Winner is Konstantin - 1065!

*/