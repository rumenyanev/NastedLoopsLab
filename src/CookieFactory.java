import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBatch = Integer.parseInt(scanner.nextLine());

        boolean flour = false;
        boolean eggs = false;
        boolean sugar = false;
        String ingredients = "";

        for (int i = 1; i <= countBatch; i++) {
            while (!flour || !eggs || !sugar || !ingredients.equals("Bake!")) {
                ingredients = scanner.nextLine();
                switch (ingredients) {
                    case "flour":
                        flour = true;
                        break;
                    case "eggs":
                        eggs = true;
                        break;
                    case "sugar":
                        sugar = true;
                        break;
                }
                if (ingredients.equals("Bake!")) {
                    if (flour && eggs && sugar){
                        System.out.printf("Baking batch number %d...\n",i);
                        flour=false;
                        eggs=false;
                        sugar=false;
                        break;
                    }else{
                        System.out.println("The batter should contain flour, eggs and sugar!");
                    }
                }
            }

        }
    }
}
/*
8. Фабрика за бисквити
Фабрика за бисквити приема поръчки всеки ден. Напишете програма, която помага на сладкарите да
направят бисквитите по-бързо, само като въвеждат необходимите продукти в компютъра.
Основните компоненти са брашно, яйца и захар и те винаги трябва да присъстват в сместа. За различните
видове бисквити се прибавят различни допълнителни продукти, техния брой не е ограничен. Като вход
програмата първо ще приема едно цяло число - броят на партидите, които трябва да се направят днес. На
следващите редове ще се въвеждат продуктите за всяка смес. При въвеждане на команда "Bake!",
съответната смес ще се слага във фурната.
Ако сместа за печене не съдържа поне един от задължителните компоненти : брашно, яйца или захар, то
трябва да се изписва : "The batter should contain flour, eggs and sugar!", а ако съдържа всички компоненти :
"Baking batch number {номера на партидата, която печем} …"
Примерен вход и изход
Вход Изход Вход Изход
2
flour
eggs
sugar
chocolate
Bake!
flour

Baking batch number 1...
Baking batch number 2...
3
flour
eggs
jam
Bake!
sugar
Bake!

The batter should
contain flour, eggs and
sugar!
Baking batch number 1...
Baking batch number 2...
Baking batch number 3...
eggs
sugar
caramel
peanuts
Bake!

flour
eggs
milk
almonds
sugar
Bake!
flour
eggs
sugar
Bake!*/