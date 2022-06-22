package Homework;

import static java.lang.Math.*;
import static java.lang.Math.PI;
import static java.lang.Math.round;
import static java.lang.System.*;

public class HW5 {
    public static int number = 2;

    public static void numberTask() {

        String line = "------------";
        String whitespace = " ";

        out.println(whitespace);
        out.println(line);
        out.println("Задача " + number);
        out.println(whitespace);

        number++;
    }

    public static String dayOfTheWeek (int dayOfTheWeekNum) {

        String dayOfTheWeek = "";

        if (dayOfTheWeekNum == 1) {
            dayOfTheWeek = "Понедельник";

        } else if (dayOfTheWeekNum == 2) {
            dayOfTheWeek = "Вторник";

        } else if (dayOfTheWeekNum == 3) {
            dayOfTheWeek = "Среда";

        } else if (dayOfTheWeekNum == 4) {
            dayOfTheWeek = "Четверг";

        } else if (dayOfTheWeekNum == 5) {
            dayOfTheWeek = "Пятница";

        } else if (dayOfTheWeekNum == 6) {
            dayOfTheWeek = "Суббота";

        } else if (dayOfTheWeekNum == 7) {
            dayOfTheWeek = "Воскресенье";
        }

        return dayOfTheWeek;
    }

    public static double numberMaximum (double x, double y, double z){
        //3. given three values  (x;y;z) determine the largest value and assign this value to the variable largest

        double max;

        if( x >= y && x >= z){
            max = x;

        } else if (y >= x && y >= z){
            max = y;

        } else{
            max = z;
        }

        return max;
    }

    public static int numberMinimum (int a, int b, int c){
        //4. using nested if statements, write a fragment of code that prints the smallest value contained in the
        // variables a, b, c

        int min;

        if( a <= b && a <= c){
            min = a;

        } else if (b <= a && b <= c){
            min = b;

        } else{
            min = c;
        }

        return min;
    }

    public static double tempCatAvarage(double x, double y, double z, double v, double q) {

        double min = 35.5;
        double max = 43.1;
        double average;
        double numberOfReadings = 1 + (y != 0 ? 1 : 0) + (z != 0 ? 1 : 0) + (v != 0 ? 1 : 0) + (q != 0 ? 1 : 0);
        double ceil = Math.pow(10,1);

        if((x >= min && x <= max) && (y == 0 || (y >= min && y <= max)) && (z == 0 || (z >= min && z <= max)) &&
                (v == 0 || (v >= min && v <= max)) && (q == 0 || (q >= min && q <= max))) {

            average = Math.round(((x + y + z + v + q) / numberOfReadings) * ceil) / ceil;
        }else{

            average = -1.0;
        }

        return average;
    }

    public static String converter(double c) {
        // 6. Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб
        // 75 коп”.

        double a1 = floor(c);
        double remains = (c - a1) * 100;
        int rub = (int) round(a1);
        int cop = (int) round(remains);

        return ("десятичное число " + c + " возвращает строку " + rub + " руб " + cop + " коп.");
    }

    public static String converterTwo (double a) {
        // 7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

        double a1 = floor(a);
        double remains = (a - a1) * 1000;
        int kg = (int) round(a1);
        int gr = (int) round(remains);

        return "десятичное число " + a + " возвращает строку " + kg+ " кг " + gr + " гр.";
    }

    public static double priceQuantity (double a, int b){
        //8. Написать метод, который принимает на вход 2 параметра - цену и количество товара (может быть вес товара,
        // или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

        double price = 27.98;
        int quantity = 16;
        double cost = (price * quantity);

        double scale = pow(10, 2);
        cost = ceil(cost * scale) / scale;

        return cost;
    }

    public static String cheque (double price, double weight, String name){
        //9. Написать метод, который принимает на вход необходимые параметры, и печатает чек.

        double price1 = floor(price);
        double remains = (price - price1) * 100;
        int rub = (int) round(price1);
        int cop = (int) round(remains);

        double weight1 = floor(weight);
        double remains1 = (weight - weight1) * 1000;
        int kg = (int) round(weight1);
        int gr = (int) round(remains1);

        double total = price * weight;
        double total1 = floor(total);
        double remains2 = (total - total1) * 100;
        int rub1 = (int) round(total1);
        int cop1 = (int) round(remains2);

        String precioParaKilo = "Цена за 1 кг";
        String quantity = "Количество товара";
        String amountToBePaid = "Сумма к оплате";
        String cheque = name + "\n" + precioParaKilo + "\t\t" + rub + " руб " + cop + " коп" + "\n" + quantity +
                "\t" + kg+ " кг " + gr + " гр" + "\n" + amountToBePaid + "\t\t" + rub1 + " руб " + cop1 + " коп";

        return cheque;
    }

    public static String wages (double hoursPerDay, double costPerHour, int numberOfDaysWorked){
        //10. Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы, и
        // возвращает заработную плату в месяц.

        double wages = (hoursPerDay * costPerHour) * numberOfDaysWorked;

        double a = floor(wages);
        double remains = (wages - a) * 100;
        int rub = (int) round(a);
        int cop = (int) round(remains);

        return rub + " руб. " + cop + " коп.";
    }

    public static String statement (String name, String month){
        //11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты
        // сотрудникам.

        return wages(7,8.50, 22);
    }

    public static int table(int x){
        //12. Записать в виде метода:

        if (x < 0){
            x = x;

        }else if (x > 0){
            x = x;

        }else{
            x = 0;
        }

        return x;
    }

    public static int luckyNumber (int number){
        //13. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое
        // число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.

        int thousand = number / 1000;
        int hundred = number % 1000 / 100;
        int decade = number % 100 / 10;
        int units = number % 10;

        int summ = thousand + hundred + decade + units;

        return summ > 9 ? luckyNumber(summ) : summ;
    }

    public static int median(int a, int b, int c){
        //считаем медиану

        int raz1 = a - b;
        int raz2 = a - c;
        int median;

        if (raz1 > 0 && raz2 < 0 || raz2 > 0 && raz1 < 0){
            median = a;

        }else if (raz1 > raz2){
            median = b;

        }else {
            median = c;
        }

        return median;
    }

    public static String averageMedian (int a, int b, int c){
        //14. а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.

        if (a < 0){
            a = a + (-1);

        }if (b < 0){
            b = b * (-1);

        }if (c < 0){
            c = c * (-1);
        }

        int avarage = (a + b + c) / 3;
        int avarageMedian = avarage - median(a, b ,c);

         if (avarageMedian < 0){
             avarageMedian = avarageMedian * (-1);
         }

        String aV;

        if (avarageMedian > 2){
            aV = "Среднее значение " + avarage + " отличается от медианы " + median(a, b, c) + " на "
                    + avarageMedian + ".";
        }else {
            aV = "Среднее значение = " + avarage + ", медиана = " + median(a, b, c) + ".";
        }

        return aV;
    }

    public static String numberFloor (double a){
        //15. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
        // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб
        // 00 коп”.

        double aa = floor(a);
        double a1 = aa;
        double remains = (a1 - aa) * 100;
        int rub = (int) round(a);
        int cop = (int) round(remains);

        String result = rub + " руб.\t" + cop + " коп.";

        return result;
    }

    public static double task (int a, int b, int c){
        //16. Посчитать с помощью методов класса Math:

        int z = ((a * b + c) * (int) pow(a, b));
        double y = (sqrt(z)) / PI;
        y = ceil(y);

        return y;
    }

    public static int task171(int x, int y){
        //17.1 write the java statement that assigns 1 to x if y is greater than 0
        // напишите оператор java, который присваивает 1 x, если y больше 0

        if(y > 0){
            x = 1;
        }else{
            x = x;
        }

        return x;
    }

    public static int task172(double number){
        //17.2 suppose that score is a variable of type double. Write the java statement that increases the score by 5
        //marks if score is between 80 y 90
        //предположим, что оценка является переменной типа double. Напишите оператор java, который увеличивает оценку на
        //5 баллов, если оценка находится в диапазоне от 80 до 90

        if (number < 90 && number > 80){
            number = number + 5;
        }else{
            number = number;
        }

        int result = (int)round(number);

        return result;
    }

    public static boolean task173(int i, int v){
        //17.3 rewrite in java the following statement without using the NOT (!) operator
        //перепишите в java следующее утверждение без использования оператора NOT (!)
        // item = !((i<10) || (v>50))

        boolean item = ((i > 10) && (v < 50));

        return item;
    }

    public static boolean task174(int x){
        // 17.4 write the java statement that prints true if x is an odd number and positive
        //напишите оператор java, который выводит значение true, если x является нечетным числом и положительным

        boolean number;

        if (x > 0 && (x % 2 != 0)){
            number = true;
        }else {
            number = false;
        }

        return number;
    }

    public static boolean task175(int x, int y){
        //17.5 write the java statement that prints true if both x and y are positive numbers
        //напишите оператор java, который выводит значение true, если оба x и y являются положительными числами

        boolean number;

        if(x > 0 && y > 0){
           number = true;
        }else {
            number = false;
        }

        return number;
    }

    public static boolean task176(int x, int y){
        //17.6 write the java statement that prints true if  x and y have the same sign (+/-)
        //напишите оператор java, который выводит значение true, если x и y имеют одинаковый знак (+/-)

        boolean number;

        if((x > 0 && y > 0) || (x < 0 && y < 0)){
            number = true;
        }else {
            number = false;
        }

        return number;
    }

    public static String numberRandomDegrees (int r){
        //18. Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного
        // случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”

        double a = random();
        double y = pow(r, a);
        int round = (int) round(y);

        String result = "Число " + a + " в степени " + r + " = " + round;

        return result;
    }

    public static double numberRandom (){
        //19. Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

        double a = 1 + random() * 100;
        int random = (int) floor(a);

        return random;
    }

    public static boolean isLeapYear(int year){
        //20. assume that the following declarations have been made:
        //предположим, что были сделаны следующие заявления:
        // write a fragment that will assign b true, if a represents a leap year and false otherwise
        //напишите фрагмент, который присвоит b значение true, если a представляет високосный год, и false в противном
        // случае

        boolean isLeapYear;

        if(((year % 4 == 0) && (year % 100 != 0 )) || (year % 400 == 0)){
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

       return isLeapYear;
    }

    public static void main(String[] args){

        numberTask();
        //2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели

        out.println(dayOfTheWeek(5));

        numberTask();
        //3. given three values  (x;y;z) determine the largest value and assign this value to the variable largest

        out.println(numberMaximum(250000.0, -876.00, 10.0));

        numberTask();
        //4. using nested if statements, write a fragment of code that prints the smallest value contained in the
        // variables a, b, c

        out.println(numberMinimum(-38000, 0, 35));

        numberTask();
        //5.Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

        out.println("Средняя температура кота = " + tempCatAvarage(40.0, 39.0, 41.2, 0.0, 0.0));

        numberTask();
        //6. Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб
        // 75 коп”.

        out.println (converter(65.98));

        numberTask();
        //7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

        out.println (converterTwo(10.38));

        numberTask();
        //8. Написать метод, который принимает на вход 2 параметра - цену и количество товара (может быть вес товара,
        // или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

        priceQuantity (23.76, 54);

        numberTask();
        //9. Написать метод, который принимает на вход необходимые параметры, и печатает чек.

        out.println(cheque(3.40, 5.250, "Яблоки"));
        out.println(" ");
        out.println(cheque(1.30, 5.0, "Хлеб"));

        numberTask();
        //10. Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
        //и возвращает заработную плату в месяц.

        out.println ("Заработная плата в месяц " + wages(6.50, 100.20, 22));

        numberTask();
        //11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи
        // зарплаты сотрудникам.

        out.println(statement("Сидорова Галина Ивановна", "Март"));

        numberTask();
        //12. Записать в виде метода:

        out.println(table(18));

        numberTask();
        //13. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое
        // число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.

        out.println(luckyNumber(8673));

        numberTask();
        //14. а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
        //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
        //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

        out.println(averageMedian(1, 16, 17));

        numberTask();
        //15. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
        // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб
        // 00 коп”.

        out.println(numberFloor(10.75));

        numberTask();
        //16. Посчитать с помощью методов класса Math

        out.println(task(3, 4, 20));

        numberTask();
        //17.1 write the java statement that assigns 1 to x if y is greater then 0
        //(напишите инструкцию java, которая присваивает 1 x, если y больше 0)

        out.println(task171(10, 1));

        //17.2 suppose that score is a variable of type double. Write the java statement that increases the score by 5
        //marks if score is between 80 y 90
        //предположим, что оценка является переменной типа double. Напишите оператор java, который увеличивает оценку на
        //5 баллов, если оценка находится в диапазоне от 80 до 90

        out.println(task172(73.4));

        //17.3 rewrite in java the following statement without using the NOT (!) operator
        //перепишите в java следующее утверждение без использования оператора NOT (!)

        out.println(task173(2,100));

        //17.4 write the java statement that prints true if x is an odd number and positive
        //напишите оператор java, который выводит значение true, если x является нечетным числом и положительным

        out.println(task174(6));

        //17.5 write the java statement that prints true if both x and y are positive numbers
        //напишите оператор java, который выводит значение true, если оба x и y являются положительными числами

        out.println(task175(987,8));

        //17.6 write the java statement that prints true if  x and y have the same sign (+/-)
        //напишите оператор java, который выводит значение true, если x и y имеют одинаковый знак (+/-)

        out.println(task176(9,987));

        numberTask();
        //18. Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного
        // случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”

        out.println(numberRandomDegrees(4));

        numberTask();
        //19. Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

        out.println(numberRandom());

        numberTask();
        //20. assume that the following declarations have been made:
        //предположим, что были сделаны следующие заявления:
        // write a fragment that will assign b true, if a represents a leap year and false otherwise
        //напишите фрагмент, который присвоит b значение true, если a представляет високосный год, и false в противном
        // случае

        out.println(isLeapYear(2035));
    }
}