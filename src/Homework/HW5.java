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

    public static String tempCatAvarage(double x, double y, double z, double v, double q) {

        Double avarage = null;

        if ((x > 27 && x < 43) && (y == 0) && (z == 0) && (v == 0) && (q == 0)) {
            avarage = x;

        }
        if ((x > 27 && x < 43) && (y > 27 && y < 43) && (z == 0) && (v == 0) && (q == 0)) {
            avarage = (x + y) / 2;

        }
        if ((x > 27 && x < 43) && (y > 27 && y < 43) && (z > 27 && z < 43) && (v == 0) && (q == 0)) {
            avarage = (x + y + z) / 3;

        }
        if ((x > 27 && x < 43) && (y > 27 && y < 43) && (z > 27 && z < 43) && (v > 27 && v < 43) && (q == 0)) {
            avarage = (x + y + z + v) / 4;

        }
        if ((x > 27 && x < 43) && (y > 27 && y < 43) && (z > 27 && z < 43) && (v > 27 && v < 43)
                && (q > 27 && q < 43)) {
            avarage = (x + y + z + v + q) / 5;
        }

        String result = "Средняя температура кота = ";
        out.println(result + avarage);

        return result;
    }

    public static String converter(double c) {
        // 6. Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб
        // 75 коп”.

        Double a1 = floor(c);
        double ostatok = (c - a1) * 100;
        Integer rub = (int) round(a1);
        Integer cop = (int) round(ostatok);

        String str = ("десятичное число " + c + " возвращает строку " + rub + " руб " + cop + " коп.");

        return str;

    }

    public static String converterTwo (double a) {
        // 7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

        Double a1 = floor(a);
        double ostatoc = (a - a1) * 1000;
        Integer kg = (int) round(a1);
        Integer gr = (int) round(ostatoc);

        String asd = "десятичное число " + a + " возвращает строку " + kg+ " кг " + gr + " гр.";

        return asd;

    }

    public static double priceQuantity (double a, int b){
        //8. Написать метод, который принимает на вход 2 параметра - цену и количество товара (может быть вес товара,
        // или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

        double price = 27.98;
        int quontity = 16;
        double cost = (price * quontity);

        if (cost < 0){
            cost = cost * (-1);
        }else {
            cost = cost;
        }

        double scale = pow(10, 2);
        cost = ceil(cost * scale) / scale;

        out.println(cost);

        return cost;
    }

    public static String cheque (double price, double weight, String name){
        //9. Написать метод, который принимает на вход необходимые параметры, и печатает чек.

        Double price1 = floor(price);
        double ostatok = (price - price1) * 100;
        Integer rub = (int) round(price1);
        Integer cop = (int) round(ostatok);

        Double weight1 = floor(weight);
        double ostatoc = (weight - weight1) * 1000;
        Integer kg = (int) round(weight1);
        Integer gr = (int) round(ostatoc);

        double total = price * weight;
        Double total1 = floor(total);
        double ostatok1 = (total - total1) * 100;
        Integer rub1 = (int) round(total1);
        Integer cop1 = (int) round(ostatok1);

        String presioParaKilo = "Цена за 1 кг";
        String quantity = "Количество товара";
        String amountToBePaid = "Сумма к оплате";
        String line = "----------------------------------";

        out.println(name);
        out.println(presioParaKilo + "\t\t" + rub + " руб " + cop + " коп.");
        out.println(quantity + "\t" + kg+ " кг " + gr + " гр.");
        out.println(line);
        out.println(amountToBePaid + "\t\t" + rub1 + " руб " + cop1 + " коп.");

        return name;
    }

    public static String wages (double hoursPerDay, double costPerHour, int numberOfDaysWorked){
        //10. Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы, и
        // возвращает заработную плату в месяц.

        double wages = (hoursPerDay * costPerHour) * numberOfDaysWorked;

        Double a1 = floor(wages);
        double remains = (wages - a1) * 100;
        Integer rub = (int) round(a1);
        Integer cop = (int) round(remains);

        String monthlySalary = rub + " руб. " + cop + " коп.";

        return monthlySalary;
    }

    public static String statement (String name){
        //11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты
        // сотрудникам.

        return name;
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
        int median1;

        if (raz1 > 0 && raz2 < 0 || raz2 > 0 && raz1 < 0){
            median1 = a;

        }else if (raz1 > raz2){
            median1 = b;

        }else {
            median1 = c;
        }

        return median1;
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
        //naxtUp - Method округляет double
    public static String numberFloor (double a){
        //15. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
        // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб
        // 00 коп”.

        double aa = floor(a);
        double a1 = aa;
        double ostatok = (a1 - aa) * 100;
        Integer rub = (int) round(a);
        Integer cop = (int) round(ostatok);

        String result = rub + " руб.\t" + cop + " коп.";

        return result;
    }

    public static double task (int a, int b, int c){
        //16. Посчитать с помощью методов класса Math:

        int z = ((a * b + c) * (int) pow(a, b));
        double y = (sqrt(z)) / PI;
        y = ceil(y);

        out.println(y);

        return y;
    }

    public static String numberRandomDegrees (int r){
        //18. Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного
        // случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”

        double a = random();
        double y = pow(r, a);
        int round = (int) round(y);

        String result = "Число " + a + " в степени " + r + " = " + round;
        out.println(result);

        return result;
    }

    public static double numberRandom (){
        //19. Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

        double a = 1 + random() * 100;

        System.out.println(a);

        return a;
    }

   // public static int qwe(int y){
        //17.1
  //      int x;

    //    if (y > 0) {
   //         x = 1;
   //     }

   //     return x;
   // }





    public static void main(String[] args){

        numberTask();
        //2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели

        out.println(dayOfTheWeek(7));

        numberTask();
        //3. given three values  (x;y;z) determine the largest value and assign this value to the variable largest

        out.println(numberMaximum(250000.0, -876.00, 10.0));

        numberTask();
        //4. using nested if statements, write a fragment of code that prints the smallest value contained in the
        // variables a, b, c

        out.println(numberMinimum(-38000, 0, 35));

        numberTask();
        //5.Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

        tempCatAvarage(25.0, 30.0, 40.0, 35.0, 35.0);

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

        cheque(3.40, 5.250, "Яблоки");
        out.println(" ");
        cheque(1.30, 5.0, "Хлеб");

        numberTask();
        //10. Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
        //и возвращает заработную плату в месяц.

        out.println ("Заработная плата в месяц " + wages(6.50, 100.20, 22));

        numberTask();
        //11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи
        // зарплаты сотрудникам.

        out.println("Март 2022");
        out.println(statement("Смирнова Мария Ивановна") + "\t\t" + wages(6.50, 100.20, 22));
        out.println(statement("Серебряков Иван Петрович") + "\t" + wages(7.30, 200.38, 19));

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

        task(3, 4, 20);

        numberTask();
        //17. write the java statement that assigns 1 to x if y is greater then 0
        //(напишите инструкцию java, которая присваивает 1 x, если y больше 0)

        int x;
        int y = 5;
        
        if (y > 0){
            x = 0;
            
        }else {

        }

        //out.println(x);




        numberTask();
        //18. Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного
        // случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”

        numberRandomDegrees(4);

        numberTask();
        //19. Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

        numberRandom();

        int aRandom = (int) floor(numberRandom());
        out.println(aRandom);

        numberTask();
        //20. assume that the following declarations have been made:
        //предположим, что были сделаны следующие заявления:
        // write a fragment that will assign b true, if a represents a leap year and false otherwise
        //напишите фрагмент, который присвоит b значение true, если a представляет високосный год, и false в противном
        // случае

        int year = 2000;
        boolean isLeapYear;

        if ( ( (year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        out.println(isLeapYear);


    }

}



