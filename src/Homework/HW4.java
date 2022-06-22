package Homework;

import static java.lang.System.*;

public class HW4 {

    public static int num = 3;

    public static void text() {

        out.println(" ");
        out.println("Задача " + num);
        out.println("--------------------------");
        num++;
    }

    public static void devisionResult (int a, int b) {

        int resultD = a / b;
        String letra1 = "Результат деления ";
        String letra2 = " на ";
        String letra3 = " = ";

        out.print(letra1 + a + letra2 + b + letra3 + resultD);

    }

    public static void remainderDivision (int a, int b){

        int resultR = a % b;
        String letra1 = ", а остаток от деления = ";

        out.println(letra1 + resultR);

    }

    public static void applesStudents (int apple, int student){

        String letra1 = "Если ";
        String letra2 = " яблок(а) поделить на ";
        String letra3 = " учеников, то каждый ученик получит по ";
        String letra4 = " яблок(a), и ";
        String letra5 = " яблок(а) останется учителю.";
        int result1 = apple / student;
        int result2 = apple % student;

        out.println(letra1 + apple + letra2 + student + letra3 + result1 + letra4 + result2 + letra5);

    }

    public static String HW2apple(int apples) {
        int twoLastSymbols = apples % 100;
        int apple2 = apples % 10;
        String appl = "яблоко";

        if (apple2 == 1) {
            appl = "яблоко";
        }

        if (apple2 == 2 || apple2 == 3 || apple2 == 4) {
            appl = "яблока";
        }

        if (apple2 > 4 && apple2 < 11 || apple2 == 0 || twoLastSymbols == 11) {
            appl = "яблок";
        }

        return appl;
    }

    public static void temperatura(double tempC) {

        double tempF = (tempC * 9 / 5) + 32;

        out.println("Температура в цельсиях - " + tempC + ", температура в фаренгейтах - " + tempF);
    }

    public static void tablIntejer(int i) {

        String lineHorizontal = "-----------------------------";
        String lineVertical = "|";

        out.println(lineHorizontal);
        i = i * i;
        out.println(lineVertical + "i ^ 2" + "\t\t" + lineVertical + "\t " + i + "\t\t" + lineVertical);
        out.println(lineHorizontal);

    }

    public static void checkingTheTask (int expectedResult, int actualResult){

        if(expectedResult == actualResult){
            out.println("true");
        }else{
            out.println("fail");
        }
    }

    public static short numberShort(short a){
        //21. Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит
        // результат проверки.
        //( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)

        short length = (short) (Math.log10(a) + 1);

        return length;
    }

    public static void main(String[] args) {

        text();
        //3. Записать в виде кода следующие логические выражения:
        //(2 = 2) И (7 = 7)
        int a = 2;
        int b = 7;
        boolean c = a == 2 && b == 7;
        out.println("(2 = 2) И (7 = 7) - " + c);

        ////Не(15 < 3);
        int d = 15;
        int e = 3;
        boolean f = !(d > e);
        out.println("!(15 < 3) - " + f);

        //("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        String sosna = "Сосна";
        String vishnja = "Вишня";
        String dub = "Дуб";
        boolean g = sosna.equals(dub) || vishnja.equals("Клён");
        out.println("(\"Сосна\" = \"Дуб\") ИЛИ (\"Вишня\" = \"Клён\") - " + g);

        //Не("Сосна" = "Дуб");
        boolean z = !(sosna.equals(dub));
        out.println("!(\"Сосна\" = \"Дуб\") - " + z);

        //(Не(15 < 3)) И (10 > 20);
        int d1 = 10;
        int e1 = 20;
        boolean f1 = !(d < e) && (d1 > e1);
        out.println("(!(15 < 3)) && (10 > 20) - " + f1);

        //("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");

        String phrase1 = "Глаза, чтобы видеть";
        String phrase3 = "третий этаж выше";

        boolean w2 = phrase1.equals("Глаза, чтобы видеть") && phrase3.equals("третий этаж выше");
        out.println("(Глаза даны, чтобы видеть)" + " И " + "(Под третьим этажом находится второй этаж) "
                + w2);

        //(6/2 = 3) ИЛИ (7*5 = 20)
        int x = 6;
        int v = 5;
        boolean x1 = (x / a == e) || (b * v == e1);
        out.println("(6/2 = 3) || (7*5 = 20) - " + x1);

        text();
        //4. Записать в виде кода:
        // ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
        String minuta = "60 секунд";
        String clockWork = "показывают время";
        boolean n1 = minuta.equals("70 секунд") || clockWork.equals("показывают время");
        out.println("(\"В минуте 70 секунд\") || (\"Работающие часы показывают время\") - " + n1);

        //!(28 > 7) И !(300/5 = 60);
        int m = 28;
        int l = 300;
        int n = 60;
        boolean w1 = !(m > b) && !(n / v == n);
        out.println("!(28 > 7) && !(300/5 = 60) - " + w1);

        //("Телевизор - электрический прибор") И ("Стекло - дерево");
        String tv = "электрический прибор";
        String glass = "песок";
        boolean m1 = tv.equals("электрический прибор") && glass.equals("дерево");
        out.println("(\"Телевизор - электрический прибор\") И (\"Стекло - дерево\") - " + m1);

        //Не((300 < 100))  → ("Жажду можно утолить водой");
        int p = 100;
        if (!(300 < 100)) {
            out.println("Жажду можно утолить водой");
        }

        //(75 < 81) → (88 = 88)
        int q = 75;
        int r = 81;
        if (q < r) {
            out.println("(88 = 88)");
        }

        text();
        //5. Записать в виде кода следующие выражения:
        //а) Андрей старше Светы. Наташа старше Светы.

        int andrej = 30;
        int sweta = 20;
        int natasha = 25;
        if (andrej > sweta && natasha > sweta) {
            out.println(true);
        } else {
            out.println(false);
        }

        //б) На полке стоят учебники, а на столе лежат справочники.
        String textB = "учебники";
        String guide = "справочники";
        if (textB.equals("учебники")) {
            out.print("На полке стоят учебники ");
        }
        if (guide.equals("справочники")) {
            out.println("на столе лежат справочники");
        }

        //в) БОльшая детей — девочки. Остальные - мальчики.
        int childrenAll = 100;
        int childrenGirls = 40;
        if (childrenAll / 2 < childrenGirls) {
            out.println("БОльшая детей — девочки. Остальные - мальчики");
        } else {
            int childrenBoys = childrenAll - childrenGirls;
            out.println("Мальчиков больше - " + childrenBoys);
        }

        text();
        //6. “Водительские права можно получить, только когда исполнится 16 лет.”
        int limit = 16;
        int age1 = 16;
        if (age1 >= limit) {
            out.println("права можно получить");
        } else {
            out.println("права получить нельзя");
        }

        text();
        //7. Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно
        String actions1 = "Петя едет в автобусе";
        String actions2 = " читает книгу";
        String actions3 = "смотрит в окно";

        String actionsPetja = "(!(actions1) && (actions2) || actions3))";
        out.println(actionsPetja);

        text();
        //8 “Если с другом ты, это хорошо, а когда наоборот - плохо”

        String withFriend = "с другом";

        if(withFriend == "с другом"){
            out.println("Хорошо");
        }else {
            out.println("Плохо");
        }

        text();
        //9. Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок. +
        Integer ageTu = 30;
        String adult = "взрослый";
        String kid = "ребенок";
        Integer.toString(ageTu);

        if (ageTu > 18) {
            out.println(adult);
        } else {
            out.println(kid);
        }

        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String ground = "сухая";

        if (ground.equals("сухая")) {
            out.println("нет дождя");
        } else {
            out.println("идет дождь");
        }

        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        if (ground.equals("сухая")) {
            out.println("нет дождя");
            if (ground != "сухая") {
                out.println("идет дождь");
            }
        } else {
            out.println("идет снег");
        }

        //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        String clouds = "тучи";
        if (clouds.equals("тучи")) {
            out.println("идет дождь");
        } else {
            out.println("идет “слепой” дождь");
        }

        //Если сегодня суббота, значит, завтра воскресенье.
        String today = "суббота";
        if (today.equals("суббота")) {
            out.println("Завтра воскресенье");
        }

        //Если сегодня пятница, значит, вчера был четверг. Иначе вчера был не четверг, а завтра - не воскресенье
        today = "пятница";
        String yesterday = "четверг";
        String tomorrow1 = "воскресенье";

        if (today.equals("пятница")) {
            out.println("Вчера " + yesterday);
        } else {
            boolean b1 = (yesterday != "четверг") && (tomorrow1 != "воскресенье");
            out.println(b1);
        }

        //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        String cancerWistled = "да";

        if (cancerWistled.equals("да")) {
            out.println("прошла вечность");
        } else {
            out.println("ждите дальше");
        }

        // Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.

        String scool = "закончил школу";

        if (ageTu > 17 || (scool == "закончил школу")) {
            out.println("можешь не жить с родителями");
        } else {
            out.println("живи с родителями");
        }

        text();
        //10. Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.

        int b1 = 0;

        if (b % 2 == 0) {
            b1 = b * 2;
            out.println(b1 + " = " + b + " * " + 2);
        } else {
            b1 = b * b;
            out.println(b1 + " = " + b + " * " + b);
        }

        text();
        //11. Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //Голосовать можно с 18 лет +

        ageTu = 18;

        if (ageTu > 17) {
            out.println("Голосовать можно");
        } else {
            out.println("Голосовать нельзя");
        }

        //Машину можно водить с 16 лет
        if (ageTu >= 16) {
            out.println("Машину можно водить");
        } else {
            out.println("Машину нельзя водить");
        }

        //В школу можно идти с 5 лет +

        if (ageTu > 4 && ageTu < 18) {
            out.println("В школу можно идти");
        } else {
            out.println("В школу нельзя идти");
        }

        text(); // +
        //12. Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия: +
        //5 - выдать похвальную грамоту и перевести в следующий класс
        //4 - перевести в следующий класс
        //3 - дать задание на лето и перевести в следующий класс
        //2 - вызвать родителей и оставить в текущем классе на второй год

        int mark = 6;

        if (mark == 5) {
            out.println("выдать похвальную грамоту и перевести в следующий класс");
        }
        if (mark == 4) {
            out.println("перевести в следующий класс");
        }
        if (mark == 3) {
            out.println("дать задание на лето и перевести в следующий класс");
        }
        if (mark == 2) {
            out.println("вызвать родителей и оставить в текущем классе на второй год");
        }
        if (mark > 5 || mark < 2) {
            out.println("некорректные данные");
        }

        text(); // +
        //13. Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа, которые делятся на
        // 3 без остатка; и вычитает числа, которые делятся на 5 без остатка. Программа умножает числа, которые
        // делятся на 2 без остатка, но если хотя бы одно число отрицательное, программа умножает результат
        // предыдущего действия на (-1).
        //Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести
        // действия.

        int y = 0;

        if (x % 3 == 0 && y % 3 == 0) {
            int z1 = x + y;
            out.println("x + y = " + z1);
        }
        if (x % 5 == 0 && y % 5 == 0) {
            int z1 = x - y;
            out.println("x - y = " + z1);
        }
        if (x % 2 == 0 && y % 2 == 0) {
            int z1 = x * y;
            out.println("x * y = " + z1);
            if (x < 0 || y < 0) {
                z1 = z1 * (-1);
                out.println(z1);
            }
        } else {
            out.println("Невозможно произвести действия");
        }

        text();
        //14. Распечатать следующие выражения, используя метод и параметры:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        //И так далее все возможные варианты.
        //Сравнить код из HW2 с кодом из HW4. Что для вас легче?
        int k = 5;
        l = 10;
        m = 15;

        devisionResult(k, l);
        remainderDivision(k, l);

        devisionResult(l, m);
        remainderDivision(l, m);

        devisionResult(m, l);
        remainderDivision(m, l);

        text();
        //15. Выполнить задание 18 из HW2 с помощью метода и параметров:
        //а) Создать переменные apple и student и присвоить им значения 40 и 6 соответственно. Распечатать
        // выражение:
        //Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется
        // учителю.
        //Распечатать это же выражение со значениями 100 и 21.

        int apple = 100;
        int students = 21;

        applesStudents(apple, students);

        text();
        //16. Выполнить задание 18 из HW2 с помощью метода и параметров:
        //Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически в
        // зависимости от значений параметров.
        //Распечатать выражение с параметрами:

        int app = 55;
        int student = 5;

        out.println("Если " + app + " " + HW2apple(app) + " поделить на " + student
                + " учеников, то каждый ученик " + "получит по " + app / student + " "
                + HW2apple(app / student) + ", и " + app % student + " " + HW2apple(app % student)
                + " останется учителю.");

        text();
        //17. Напишите метод, который примет на вход параметр температуры в Цельсиях, и распечатает результат
        // температуры в Цельсиях и в Фаренгейтах.

        double tempC = 23.4;

        temperatura(tempC);

        text();
        //18. а) Создать метод, который примет на вход параметр i и распечатает таблицу:
        //b) поменять значение i и распечатать таблицу с новым значением i

        int i = 20;

        tablIntejer(i);

        text();
        //19. Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
        // Тестовые данные - 2, 5, 0.

        int expectedResult = 0;
        int actualResult = b1;

        checkingTheTask(expectedResult, actualResult);

        text();
        //20. Напишите тест, который валидирует ваш код из задания №11. Придумайте тестовые данные.
        // Выведите результат проверки на печать.

        expectedResult = 30;
        actualResult = ageTu;

        checkingTheTask(expectedResult, actualResult);

        text();
        //21. Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит
        // результат проверки.
        //( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)

        short number = 12345;

        out.println(numberShort(number));
    }
}







