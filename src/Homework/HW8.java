package Homework;

import java.util.SortedMap;

public class HW8 {

    //7. Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел

    public static int[] ArraysFivesInteger (int a, int b, int c, int e, int d){

        int[] fivesNumbers = {a, b, c, e, d};

        for (int i = 0; i < fivesNumbers.length; i++){
            System.out.print(fivesNumbers[i] + " ");
        }

        return fivesNumbers;
    }

    //8. Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел.

    public static Double[] ArraysFivesDouble (double a, double b, double c, double e, double d){

        Double[] fivesNumbers = {a, b, c, e, d};

        for (int i = 0; i < fivesNumbers.length; i++){
            System.out.print(fivesNumbers[i] + " ");
        }

        return fivesNumbers;
    }

//    private static <T> T[] creatArray(T a,T b, T c, T d, T e){
//
//    }

    //9. Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов

    public static String[] ArraysFivesString (String a, String b, String c, String e, String d){

        String [] fivesNumbers = {a, b, c, e, d};

        for (int i = 0; i < fivesNumbers.length; i++){
            System.out.print(fivesNumbers[i] + " ");
        }

        return fivesNumbers;
    }

    //10. Написать метод, который принимает на вход массив целых чисел, и возвращает массив тех же чисел, умноженных на
    // 2.5

//    public static double[] multiplication(int[] a, double b){
//
//        a = new int [a.length];
//
//        for (int i = 0; i < a.length; i++){
//            a[i] = (int)(1 + Math.random() * 10);{
//                new aa =
//            }
//        }
//
//        return a;
//    }

    //11. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество четных
    // чисел в этом массиве

    public static int evenNumbers(int[] a){

        a = new int [a.length];
        int b = 0;

        for (int i = 0; i < a.length; i++){
            a[i] = (int)(1 + Math.random() * 10);

            if (a[i] % 2 == 0){
                    b++;

            }
        }

        return b;
    }



    //12. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив нечетных чисел

    public static int[] oddInteger(int[] a){

        a = new int [a.length];

        for (int i = 0; i < a.length; i++){
            a[i] = (int)(1 + Math.random() * 10);{
                if(a[i] % 2 != 0){
                    System.out.print(a[i] + " ");
                }
            }
        }

        return a;
    }

    //13. Написать метод, который принимает на вход массив целых чисел, и возвращает массив значений true или false,
    // если числа больше 10



    //14. Написать метод, который принимает на вход массив слов, и возвращает строку, состоящую из этих слов

    //16. Написать метод, который принимает на вход целое положительное число в пределах от 1 до 10 исключительно, и
    // возвращает таблицу умножения на это число в виде массива
    // Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public static int[] multiplicationTable (int r){

        int[] a = new int [9];

        for(int i = 0, b = 0; i < a.length; i++) {
            if (r > 0 && r < 10){
                a[i] = b * r;
                b++;
                System.out.print(a[i] + " ");
            }
        }

    return a;

    }

    //18. Написать метод, который принимает на вход длину массива и генерирует массив случайных положительных чисел
    // от 0 до 100 исключительно.

    public static int[] randomNumbers (int a){

        int[] b = new int[a];

        for(int i = 0; i < b.length; i++){
            b[i] = (int)(1 + Math.random() * 100);
            System.out.print(b[i] + " ");
        }

        return b;
    }

    //19. Написать метод, который принимает на вход длину массива l и количество знаков d (однозначные, двузначные,
    // трехзначные и тд числа), и генерирует массив случайных целых положительных чисел длины l, в котором все числа
    // имеют количество знаков d

    public static int[] Dependence(int l, int d) {

        int [] a = new int [l];

        for(int i = 0; i < a.length; i++) {
            if (d == 1) {
                a[i] = (int) (1 + Math.random() * 10);
                return a;

            } else if (d == 2) {
                a[i] = (int) (10 + Math.random() * 100);
                return a;

            } else if (d == 3) {
                a[i] = (int) (100 + Math.random() * (1000 - 100));
                return a;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        Utils.taskNumber();
        //3. Создать объекты типа Integer, Double, String и присвоить им любые значения.

        Integer a = 1;
        Double b = 1.5;
        String c = "C";

        Utils.taskNumber();
        Utils.taskNumber();

        Utils.taskNumber(); //+
        //6. Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат сравнения в виде
        // таблички:

        Boolean a_1 = a.equals(HW8_1.aa);
        Boolean b_1 = b.equals(HW8_1.bb);
        Boolean c_1 = c.equals(HW8_1.cc);

        String line = "-------------------------------------------------";
        String lineV = "|";

        System.out.println(line);
        System.out.println("HW8" + "\t\t\t\t" + lineV + " HW8_1" + "\t\t\t\t" + lineV + " areEquals?");
        System.out.println(line);
        System.out.println("Integer a = " + a + "\t" + lineV + " Integer aa = " + HW8_1.aa + "\t" + lineV + " " + a_1);
        System.out.println(line);
        System.out.println("Double b = " + b + "\t" + lineV + " Double bb = " + HW8_1.bb + "\t" + lineV + " " + b_1);
        System.out.println(line);
        System.out.println("String c = " + c + "\t" + lineV + " String cc = " + HW8_1.cc + "\t\t" + lineV + " " + c_1);
        System.out.println(line);

        Utils.taskNumber(); //+
        //7. Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел

        ArraysFivesInteger(1, 3, 5, 7, 9);

        Utils.taskNumber(); //+
        //8. Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел

        ArraysFivesDouble(2.1, 3.5, 7.2, 4.4, 9.8);

        Utils.taskNumber(); //+
        //9. Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов

        ArraysFivesString("Mother", "Dad", "Grandmother", "Grandfather", "I");

        Utils.taskNumber(); //+
        //10. Написать метод, который принимает на вход массив целых чисел, и возвращает массив тех же чисел, умноженных
        // на 2.5

        Utils.taskNumber();
        //11. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество четных
        // чисел в этом массиве



        Utils.taskNumber(); //+
        //12. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив нечетных
        // чисел

//        oddInteger();

        Utils.taskNumber();
        //13. Написать метод, который принимает на вход массив целых чисел, и возвращает массив значений true или false,
        //если числа больше 10


        Utils.taskNumber();
        //14. Написать метод, который принимает на вход массив слов, и возвращает строку, состоящую из этих слов

        Utils.taskNumber();
        //15. Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива

        int[] qqq = new int [4];
        int sum = 0;

        for(int i = qqq.length / 2; i < qqq.length - 1; i++){
            qqq[i] = (int)(1 + Math.random() * 10);
            System.out.print(qqq[i] + " ");{
                sum += qqq[i];

            System.out.print(sum);
            }
        }

        Utils.taskNumber(); //+
        //16. Написать метод, который принимает на вход целое положительное число в пределах от 1 до 10 исключительно, и
        // возвращает таблицу умножения на это число в виде массива
        // Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

        multiplicationTable(4);

        Utils.taskNumber();
        //17. Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел
        // больше, или массив нечетных чисел, если нечетных чисел больше.

        int[] ttt = new int[10];

        int par = 0;
        int impar = 0;

        for(int i = 0; i < ttt.length; i++){
            ttt[i] = (int) (1 + Math.random() * 10);{
                if(ttt[i] % 2 == 0){
                    par++;
                    System.out.print(par + " ");
                }else{
                    impar++;
                    System.out.println(impar);

            }if(par > impar){
                    //System.out.print(ttt[i] + "a ");
                }else {
                    //System.out.print(ttt[i] + " ");
                }
            }
        }


        Utils.taskNumber(); //+
        //18. Написать метод, который принимает на вход длину массива и генерирует массив случайных положительных чисел
        // от 0 до 100 исключительно.

        randomNumbers(8);

        Utils.taskNumber(); //+
        //19. Написать метод, который принимает на вход длину массива l и количество знаков d (однозначные, двузначные,
        // трехзначные и тд числа), и генерирует массив случайных целых положительных чисел длины l, в котором все числа
        // имеют количество знаков d

        Dependence(3, 3);

        Utils.taskNumber();
        //20. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив только
        // двузначных чисел. Проверить работу метода на массиве из задания 18.

        Utils.taskNumber();
        //21. Написать метод, который принимает на вход массив целых положительных двузначных чисел, и возвращает массив
        // разниц между десятками и единицами



    }
}
