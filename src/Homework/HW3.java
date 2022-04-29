package Homework;

import static java.lang.Integer.*;

public class HW3 {

    private static Object value;

    public static void main(String[] args){

        String task = "Task";
        String box = "   ";
        System.out.println(task + " 2");
        //Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.

        byte a = -50;
        byte b = 75;

        System.out.println(a);
        System.out.println(b);

        System.out.println(box);
        System.out.println(task + " 3");
        //Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.

        short s = 31000;
        int z = (s - 60000);
        short t = (short) Math.round (z);

        System.out.println(s);
        System.out.println(t);

        System.out.println(box);
        System.out.println(task + " 4");
        //Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        // Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:

        int iMax = Integer.MAX_VALUE;
        int iMin = Integer.MIN_VALUE;
        String lineH = "-----------------------------";
        String lineV = "|";

        System.out.println(lineH);
        System.out.println(lineV + " int min\t" + lineV + " " + iMin + "\t" + lineV);
        System.out.println(lineH);
        System.out.println(lineV + " int max\t" + lineV + "  " + iMax + "\t" + lineV);
        System.out.println(lineH);

        System.out.println(box);
        System.out.println(task + " 5");
        //Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города

        long phoneNumber = 595992981168L;

        System.out.println(phoneNumber);

        System.out.println(box);
        System.out.println(task + " 6");
        //Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double
        // и присвоить ей значение 100.101101.
        //Распечатать результат в виде таблицы:

        float f = 100.101101F;
        float ff = 10.09999F + 20.099999F;
        double d = 100.101101;
        double dd = 10.09999 + 20.099999;

        String lineH1 = "-------------------------------------------------";

        System.out.println(lineH1);
        System.out.println(lineV + " float f = 100.101101\t" + lineV + "  " + f + "\t\t\t" + lineV);
        System.out.println(lineH1);
        System.out.println(lineV + " double d = 100.101101\t" + lineV + "  " + d + "\t\t\t" + lineV);
        System.out.println(lineH1);
        System.out.println(lineV + " Double dd\t\t\t\t" + lineV + "  " + dd + "\t" + lineV);
        System.out.println(lineH1);
        System.out.println(lineV + " Float ff\t\t\t\t" + lineV + "  " + ff + "\t\t\t\t" + lineV);
        System.out.println(lineH1);

        System.out.println(box);
        System.out.println(task + " 7");
        //a) Создать переменную типа Double с именем dd и инициализировать её результатом суммы чисел
        // 10.09999 и 20.099999.

        //b) Создать переменную типа Float с именем f и инициализировать её результатом суммы чисел
        // 10.09999 и 20.099999.

        System.out.println(box);
        System.out.println(task + " 8");
        //Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)

        float result = 10F / 3F;
        double result1 = 10.0 / 3;

        System.out.println(result);
        System.out.println(result1);

        System.out.println(box);
        System.out.println(task + " 9");
        //Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        System.out.println(box);
        System.out.println(task + " 10");
        //Распечатать слово HELLO точками

        String lineHorizontal = ".....";
        String lineVertical = ".";

        System.out.println(lineVertical + "\t" + lineVertical + "\t" + lineHorizontal + "\t" + lineVertical + "\t\t"
                + lineVertical + "\t\t" + lineHorizontal);
        System.out.println(lineVertical + "\t" +  lineVertical + "\t" + lineVertical + "\t\t" + lineVertical
                + "\t\t" + lineVertical + "\t\t" + lineVertical + "\t" + lineVertical);
        System.out.println(lineHorizontal + "\t" + lineHorizontal + "\t" + lineVertical + "\t\t" + lineVertical
                + "\t\t" + lineVertical + "\t" + lineVertical);
        System.out.println(lineVertical + "\t" +  lineVertical + "\t" + lineVertical + "\t\t" + lineVertical
                + "\t\t" + lineVertical + "\t\t" + lineVertical + "\t" + lineVertical);
        System.out.println(lineVertical + "\t" + lineVertical + "\t" + lineHorizontal + "\t" + lineHorizontal + "\t"
                + lineHorizontal + "\t" + lineHorizontal);

        System.out.println(box);
        System.out.println(task + " 11");
        //Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
        //Распечатать значения всех переменных.

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = -505.505F;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double t8 = -100000000.001;
        short t9 = 1010;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        System.out.println(box);
        System.out.println(task + " 12");
        //С помощью полей классов ссылочного типа распечатать таблицу:

        String lineH2 = "-----------------------------------------------------------------------";
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println(lineH2);
        System.out.println(lineV + " Type\t" + lineV + " Size in bits " + lineV + " min\t\t\t\t  " + lineV
                + " max\t\t\t\t\t   " + lineV);
        System.out.println(lineH2);
        System.out.println(lineV + " byte\t" + lineV + " " + Byte.SIZE + "\t\t\t   " + lineV + " " + byteMin
                + "\t\t\t\t  " + lineV + " " + byteMax + "\t\t\t\t\t   " + lineV);
        System.out.println(lineH2);
        System.out.println(lineV + " short\t" + lineV + " " + Short.SIZE + "\t\t   " + lineV + " " + shortMin
                + "\t\t\t\t  " + lineV + " " + shortMax + "\t\t\t\t   " + lineV);
        System.out.println(lineH2);
        System.out.println(lineV + " int\t" + lineV + " " + Integer.SIZE + "\t\t   " + lineV + iMin + "\t\t\t  "
                + lineV + " " + iMax + "\t\t\t   " + lineV);
        System.out.println(lineH2);
        System.out.println(lineV + " long\t" + lineV + " " + Long.SIZE + "\t\t   " + lineV + " " + longMin + " "
                + lineV + " " + longMax + "\t   " + lineV);
        System.out.println(lineH2);
        System.out.println(lineV + " float\t" + lineV + " " + Float.SIZE + "\t\t   " + lineV + " " + floatMin
                + "\t\t\t  " + lineV + " " + floatMax + "\t\t   " + lineV);
        System.out.println(lineH2);
        System.out.println(lineV + " double" + lineV + " " + Double.SIZE + "\t\t   " + lineV + " " + doubleMin
                + "\t\t\t  " + lineV + " " + doubleMax + " " + lineV);
        System.out.println(lineH2);

        System.out.println(box);
        System.out.println(task + " 13");
        //Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения, сравнить 2
        // переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать в виде выражения:
        //“Если num1 = num2, то результат сравнения методом .equal = …”

        Integer num1 = 20;
        Integer num2 = 20;
        String phrase1 = "Если num1 = num2, то результат сравнения методом .equals = ";
        String phrase2 = "Если num1 не равно num2, то результат сравнения методом .equals = ";

        System.out.println(num1.equals(num2));
        System.out.println(phrase1 + num1.equals(num2));

        //Присвоить переменным разные значения, сравнить, и вывести результат на печать:
        //“Если num1 не равно num2, то результат сравнения методом .equal = …”

        num1 = 20;
        num2 = 22;

        System.out.println(box);
        System.out.println(num1.equals(num2));
        System.out.println(phrase2 + num1.equals(num2));

        System.out.println(box);
        System.out.println(task + " 14");
        //Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        //а) одинаковыми значениями

        String phrase3 = "Если number1";
        String phrase4 = "number2, то результат сравнения методом";

        int number1 = 20;
        int number2 = 20;

        System.out.println(number1 == number2);

        System.out.println(phrase3 + " = " + phrase4 + "  = " + (number1 == number2));

        //b) number1 < number2

        boolean number3  = number1 > number2;
        System.out.println(number3);

        System.out.println(phrase3 + " < " + phrase4 + " boolean = " + number3);

        //c) number1 > number2

        if (number1 < number2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println (phrase3 + " > " + phrase4 + " " + compare(number1, number2));

        System.out.println(phrase3 + " > " + phrase4 + " if = " + (number1 < number2));

        System.out.println(box);
        System.out.println(task + " 15");
        //Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int

        Float p = 234.9999F;
        int m = Math.round (p);

        System.out.println(m);

        System.out.println(box);
        System.out.println(task + " 16");
        //С помощью метода sum() класса Double посчитать сумму двух переменных типа double.

        double mm = 23.789;
        double nn = 32.89;

        int mm1 = (int)Math.round(mm);
        int nn1 = (int)Math.round(nn);

        double summn = sum(mm1,nn1);

        System.out.println(summn);

        System.out.println(box);
        System.out.println(task + " 17");
        //С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.

        Float f1 = 5F;
        Float f2 = 10F;

        int ff1 = (int)Math.round(f1);
        int ff2 = (int)Math.round(f2);

        Integer sumFF = sum(ff1, ff2);

        System.out.println(sumFF);

        System.out.println(box);
        System.out.println(task + " 18");
        //Создать 2 переменные типа Short:

        short short1 = 12000;
        short short2 = 12300;

        //Распечатать фразу: “12000 - 12300 = -300”
        //где значение -300 выведено с помощью метода класса Short, а не операцией вычисления

        int res2 = Short.valueOf(short1).compareTo(Short.valueOf(short2));

        System.out.println(short1 + " - " + short2 + " = " + res2);

        //Присвоить переменной short1 значение 12500, вывести фразу: “12500 - 12300 = 200”,
        //где значение 200 выведено с помощью метода класса Short, а не операцией вычисления

        short1 = 12500;

        int res3 = Short.valueOf(short1).compareTo(Short.valueOf(short2));

        System.out.println(short1 + " - " + short2 + " = " + res3);

        System.out.println(box);
        System.out.println(task + " 19");
        //Создать переменные:
        //String str1 = "123.56";
        //String str2 = "123.55";
        //Double doub1 = 123.56;
        //Double doub2 = 123.55;

        String str1 = "123.56";
        String str2 = "123.55";

        Double strNum1 = Double.parseDouble(str1);
        Double strNum2 = Double.parseDouble(str2);

        Double differenceString = (strNum1 - strNum2);
        System.out.println(differenceString);

        Double doub1 = 123.56;
        Double doub2 = 123.55;

        // Распечатать результат doub1 - doub2

        Double doubRes = doub1 - doub2;
        System.out.println(doubRes);

        System.out.println(box);
        System.out.println(task + " 20");
        //Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
        // (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение, затем минимальное
        // значение. Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
        // Распечатать результат среднего значения температуры тела кота.

        Double tCat = 40.0;
        Double avarage = tCat/2;
        tCat = 30.0;
        avarage = avarage + tCat/2;

        System.out.println(avarage);

        System.out.println(box);
        System.out.println(task + " 21");
        //Создать переменную n типа Number, присвоить ей максимально возможное значение.

        Number n = Double.MAX_VALUE; // тип Number содержит все значения численных переменных! По-этому можно
        // переприсвоить значение под любым типом
        System.out.println(n);
        n = 10;
        System.out.println(n);
        n = 10.999999999;
        System.out.println(n);

        System.out.println(box);
        System.out.println(task + " 22");
        //Создать переменную Integer numberInteger = 100. Доказать, что numberInteger имеет тип Integer,
        //а numberInteger.toString() имеет тип String.

        Integer numberInteger = 100;
        String numberString = numberInteger.toString();

        System.out.println(numberInteger.getClass()); //Вызвали getClass, который показывает, к какому классу
        // принадлежит число
        System.out.println(numberString.getClass());

        System.out.println(numberInteger + 1);
        System.out.println(numberString + 1);

        System.out.println(box);
        System.out.println(task + " 23");
        //Вывести на экран следующие выражения, используя для печати только переменные:
        //“36.6 градусов по Цельсию = … градусов по Фаренгейту”, где значение по Фаренгейту должно быть вычислено по
        // формуле “50 kilogram = … lbs, 50 lb = … kg”, где значения должны быть вычислены по формулам

        double tempC = 36.6;
        double tempF = (tempC * (9/5)) + 32;
        System.out.println(tempF);
       // System.out.println(resC);

        double lbs = 2.2046226218;
        double resKilo = lbs * 0.45359237;

        System.out.println("36.6 градусов по Цельсию  = " + tempF + " градусов по Фаренгейту");
        System.out.println("50 kilogram = " + resKilo + " lbs,  50 lbs = " + resKilo + " kg");
    }
}
