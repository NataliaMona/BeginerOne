package Homework;

import java.util.Arrays;

public class HW7 {

    public static int number = 1;

    public static void taskNumber(){

        System.out.println("  ");
        System.out.println("-----------------------------");
        System.out.println("Task " + number);

        number++;
    }

    public static String getIndex(String[] array) {
        return array[array.length - 1];
    }

    public static double avarageValue (int[] a){
        //18. Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу
        // метода тестом, если параметр - массив catsAges

        int arrayLength = a.length;

        double average = 0;
        if (a.length > 0) {
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            average = sum / a.length;
        }

        return average;
    }

    public static void randomNumber (int[] mas){
        //20. Создать массив из 10 случайных положительных целых чисел

        //int[] mas = new int[10];
        mas = new int[10];

        for(int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
    }

    public static void randomNumber1(int[] differentValues ){
        //21. Создать метод, который принимает на вход массив int, и возвращает минимальное значение, максимальное
        // значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
//
//        int [] result = new int [3];
//
//        int min = 0;
//        int max = 0;
//        int averageValue = 0;
//
//        for (int i = 0; i < differentValues.length; i++) {
//            min = Math.min(min, differentValues[i]);
//            result[0] = min;
//
//        }
//        for (int i = 0; i < differentValues.length; i++) {
//            max = Math.max(max, differentValues[i]);
//            result[1] = max;
//
//        }
//        if (differentValues.length > 0) {
//            int sum = 0;
//        }
//            for (int i = 0; i < differentValues.length; i++) {
//                sum += differentValues[i];
//                result[2] = sum / differentValues.length;
//            }
//        }
//
//        return result;
   }

    public static void main(String[] args) {

        taskNumber();
        //1. Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).

        String [] catsNames = new String [8];

        catsNames [0] = "Серик";
        catsNames [1] = "Рыжик";
        catsNames [2] = "Барсик";
        catsNames [3] = "Мурзик";
        catsNames [4] = "Черныш";
        catsNames [5] = "Мимис";
        catsNames [6] = "Рыжик";
        catsNames [7] = "Пушок";

        for (int i = 0; i < 8; i++){
            System.out.println(i + " " + catsNames[i]);
        }

        taskNumber();
        //2. В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”, а значение элемента с индексом 1
        // на “Черныш”.

        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        for (int i = 0; i < 8; i++){
            System.out.println(i + " " + catsNames[i]);
        }

        taskNumber();
        //3. Создать массив catsColors и заполнить его значениями.

        String[] catsColors = {"Серый", "Черный", "Серый", "Серый", "Рыжий", "Серый", "Рыжий", "Серый"};

        for (int i = 0; i < 8; i++) {
            System.out.println(i + " " + catsColors[i]);
        }

        taskNumber();
        //4. Создать массив catsAges и заполнить его любыми значениями.

        int [] catsAges = new int[8];

        catsAges[0] = 2;
        catsAges[1] = 1;
        catsAges[2] = 4;
        catsAges[3] = 8;
        catsAges[4] = 3;
        catsAges[5] = 5;
        catsAges[6] = 6;
        catsAges[7] = 7;

        for (int i = 0; i < 8; i++){
            System.out.println(i + " " + catsAges[i]);
        }

        taskNumber();
        //5. Создать массив isCatRed и заполнить его соответствующими значениями:

        boolean[] isCatRed = new boolean[8];

        for (int i = 0; i < 8; i++){
            isCatRed[i] = catsColors[i] == "Рыжий";
            System.out.println(i + " " + isCatRed[i]);
        }

        taskNumber();
        //6. Распечатать для массивов catsNames и catsColors:
        //имя кота в коробке с номером 6

        System.out.println(catsNames[6]);

        //имена котов из коробок с четными индексами

        System.out.println(" ");

        for (int i = 0; i < 8; i++){
            if (i % 2 == 0){
                System.out.println(i + " " + catsNames[i]);
            }
        }
        //имена котов из коробок, чьи индексы кратны 4

        System.out.println(" ");

        for (int i = 0; i < 8; i++){
            if (i % 4 == 0){
                System.out.println(i + " " + catsNames[i]);
            }
        }

        //цвет котов из коробок с нечетными индексами

        System.out.println(" ");

        for (int i = 0; i < 8; i++){
            if (i % 2 != 0){
                System.out.println(i + " " + catsNames[i]);
            }
        }

        //цвет котов из коробок, чьи индексы кратны 3

        System.out.println(" ");

        for (int i = 0; i < 8; i++){
            if (i % 3 == 0){
                System.out.println(i + " " + catsColors[i]);
            }
        }

        taskNumber();
        //7. Распечатать “Накорми кота!” для всех серых котов

        for (int i = 0; i < 8; i++){
            if (catsColors[i] == "Серый"){
                System.out.println(i + " Накорми кота!");
            }
        }

        taskNumber();
        //8. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет

        for (int i = 0; i < 8; i++){
            if (catsAges[i] < 2){
                System.out.println(i + " Отнеси кота на прививку!");
            }
        }

        taskNumber();
        //9. Для кота в последней коробке распечатать имя, цвет, возраст

        System.out.println(getIndex(catsNames));
        System.out.println(getIndex(catsColors));
        System.out.println(catsAges[catsAges.length - 1]);

        taskNumber();
        //10. Распечатать имена всех котов, чей возраст больше 2 лет

        for (int i = 0; i < 8; i++){
            if (catsAges[i] > 2){
                System.out.println(i + " " + catsNames[i]);
            }
        }

        taskNumber();
        //11. Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true

        for (int i = 0; i < 8 ; i++){
            if(catsNames[i] == "Рыжик" && isCatRed[i]){
                System.out.println(i + " Накорми кота!");
            }
        }

        taskNumber();
        //12. Распечатать средний возраст котов из массива catsAges

        double sum = 0;
        for (int value : catsAges){
            sum += value;
        }

        System.out.println(sum / catsAges.length);

        taskNumber();
        //13. Распечатать возраст самого молодого кота

        int min = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            min = Math.min(min, catsAges[i]);
        }

        System.out.println(min);

        taskNumber();
        //14. Распечатать возраст самого старого кота

        int max = catsAges[7];
        for (int i = 0; i < catsAges.length; i++) {
            max = Math.max(max, catsAges[i]);
        }

        System.out.println(max);

        taskNumber();
        //15. Распечатать количество серых котов

        int countsGrayCat = 0;

        for (int i = 0; i < catsColors.length; i++){
            if (catsColors[i].equals("Серый")){
                countsGrayCat++;
            }
        }

        System.out.println(countsGrayCat);

        taskNumber();
        //16. Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет

        for (int i = 0; i < catsNames.length; i++){
            if (catsAges[i] < 4 && i % 2 == 0){
                System.out.println(i + " " + catsNames[i]);
            }
        }

        taskNumber();
        //17. Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью
        // цикла for)
//
//        int arraySize1 = 0;                 // создаю размер массива
//        for (int i = 0; i < 11; i++){
//            if(i % 2 == 0){
//                arraySize1++;
//            }
//        }
//
//        int[] mas1 = new int[arraySize1];    // создаю массив и заполняю его
//        for (int i = 0, b = 0; i < 11; i++){
//            if( i % 2 == 0){
//                mas1[b]= i;
//                System.out.print(mas1[b] + " ");
//                b++;
//            }
//        }

        int [] evenNumbers = new int [1];
        int count = 0;

        for (int i = 0; i < 11; i += 2){
            int length = count + 1;
            evenNumbers = Arrays.copyOf(evenNumbers, length);
            evenNumbers[count] = i;
            count = length;
        }

        for (int j: evenNumbers) {
            System.out.print(j + " ");
        }

        taskNumber();
        //18. Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу
        // метода тестом, если параметр - массив catsAges

        System.out.println(avarageValue(catsAges));

        taskNumber();
        //19. Создать массив нечетных отрицательных чисел в промежутке от -1000 до - 900

        int arraySize = 0;                 // создаю размер массива
        for (int i = 900; i < 1000; i++){
            if(i % 2 != 0){
                arraySize++;
            }
        }

        int[] Mas = new int[arraySize];    // создаю массив и заполняю его
        for (int i = -1000, b = 0; i < -900; i++){
            if (i % 2 != 0){
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }

        taskNumber();
        //20. Создать массив из 10 случайных положительных целых чисел

        int[] mas = new int[10];

        randomNumber(mas);

        taskNumber();
        //21. Создать метод, который принимает на вход массив int, и возвращает минимальное значение, максимальное
        // значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.


        taskNumber();
        //22. Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

        randomNumber(mas);
        System.out.println(" ");

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0){
                System.out.print(mas[i] + " ");
                System.out.println(" ");
            }
            if (i % 2 != 0){
                System.out.print(mas[i] + " ");
            }
        }

        taskNumber();
        //23. Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
        //Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.

        String[][] catsMassive = new String[3][8];

        for (int i = 0; i < catsMassive.length; i++){
            for (int j = 0; j < catsMassive.length; j++){
                if (i == 0){
                    catsMassive[i][j] = catsNames[j];
                }else if (i == 1){
                    catsMassive[i][j] = String.valueOf(catsAges[j]);
                }else{
                    catsMassive[i][j] = catsColors[j];
                }
            }
        }

        System.out.println(Arrays.deepToString(catsMassive));
        System.out.println();

        taskNumber();
        //24. Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        int [][] twoDimensionalArray = new int [4][8];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 8; j++){
                twoDimensionalArray[i][j] = (int) (1 + Math.random() * 10);
            }
        }
        for (int i = 0; i < 4; i++){
            System.out.println();
            for (int j = 0; j < 8; j++){
                    System.out.print(twoDimensionalArray[i][j] + " ");
            }
       }

        taskNumber();
        //25. Вывести сумму всех четных чисел массива из задания 24.

            int sumW = 0;
            for (int i = 0; i < twoDimensionalArray.length; i++) {
                for (int j = 0; j < twoDimensionalArray[i].length; j++){
                    if (twoDimensionalArray[i][j] % 2 == 0) {
                        sumW = sumW + twoDimensionalArray[i][j];
                    }
                }
            }

        System.out.println(sumW);

    }
}
