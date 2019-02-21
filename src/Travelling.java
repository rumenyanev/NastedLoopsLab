import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double savedMoney = 0.0;
            double neededMoney = Double.parseDouble(scanner.nextLine());
            while (savedMoney < neededMoney) {
                double save = Double.parseDouble(scanner.nextLine());
                savedMoney += save;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
/*6. Пътуване
Ани обича да пътува и иска тази година да посети няколко различни дестинации. Като си избере дестинация,
ще прецени колко пари ще й трябват за да отиде до там и ще започне да спестява. Когато е спестила
достатъчно, ще може да пътува.
От конзолата всеки път ще се четат първо дестинацията и минималния бюджет, който ще е нужен за
пътуването .
След това ще се четат няколко суми, които Ани спестява като работи и когато успее да събере достатъчно за
пътуването, ще заминава, като на конзолата трябва да се изпише:
&quot;Going to {дестинацията}!&quot;
Когато е посетила всички дестинации, които иска, вместо дестинация ще въведе &quot;End&quot; и програмата ще
приключи.
Примерен вход и изход
Вход            Изход                        Вход             Изход
Greece         Going to Greece!              France          Going to France!
1000           Going to Spain!               2000            Going to Portugal!
200                                          300             Going to Egypt!
200                                          300
300                                          200
100                                          400
150                                          190
240                                          258
Spain                                        360
1200                                         Portugal
300                                          1450
500                                          400
193                                          400
423                                          200
End                                          300
                                             300
                                             Egypt
                                             1900
                                             1000
                                             280
                                             300
                                             500
                                             End

                                                      */