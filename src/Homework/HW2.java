package Homework;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int multKL = k * l;
        int sumKL = k + l;
        int subLM = l - m;
        int devKL = k / l;
        int remKL = k % l;
        int devKM = k / m;
        int remKM = k % m;
        int devLM = l / m;
        int remLM = l % m;
        int devMK = m / k;
        int remMK = m % k;
        int devLK = l / k;
        int remLK = l % k;
        int devML = m / l;
        int remML = m % l;
        int apple = 40;
        int student = 6;
        int devAppleStudent = apple / student;
        int remAppleStudent = apple % student;
        int apple1 = 100;
        int student1 = 21;
        int devApple1Student1 = apple1 / student1;
        int remApple1Student1 = apple1 % student1;
        int num48 = 48;
        int num8 = 8;
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y-x;
        int result21 = (x+3)*(x+3);
        int result22 = ((3+4*x)/5)-((10*(y-5)*(a+b+c))/x)+9*(4/x+(9+x)/y);
        int int1 = ((5*x)+(7*y))/(8*x)+(10*y);
        double int2 = ((3*x)-y)/(x+y);
        int int3 = (a+b+c/d+((a+b)/(c+d))+a*b);
        double result23 = int1/int2/int3;
        String lineH = "_____________________________";
        String lineV = "|";

        //в столбик (12)
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        //в строку (13)
        System.out.println("" + k + " " + l + " " + m);

        //конкатенация, через запятую (14)
        System.out.println("" + k + ", " + l + ", " + m);

        //эначение переменной (15)???
        System.out.println("k = " + k + " l = " + l + " m = " + 18);

        //Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции: (16)
        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + k * m);
        System.out.println("Разность переменных l и m = " + subLM);

        //Распечатать следующие выражения: (17)
        String divisionResult = "Результат деления";
        String remainder = ", а остаток от деления  = ";

        System.out.println(divisionResult + " k на l = " + devKL + remainder + remKL);
        System.out.println(divisionResult + " k на m = " + devKM + remainder + remKM);
        System.out.println(divisionResult + " l на m = " + devLM + remainder + remLM);
        System.out.println(divisionResult + " l на k = " + devLK + remainder + remLK);
        System.out.println(divisionResult + " m на k = " + devMK + remainder + remMK);
        System.out.println(divisionResult + " m на l = " + devML + remainder + remML);

        //Распечатать выражение: (18)
        String if1 = "Если ";
        String appleDev = " яблок поделить на ";
        String everyStudent = " учеников, то каждый ученик получит по ";
        String apple2 = " яблок(a), и ";
        String appleTeacher = " яблок(а) останется учителю.";

        System.out.println(if1 + apple + appleDev + student + everyStudent + devAppleStudent + apple2 + remAppleStudent
                + appleTeacher);
        System.out.println(if1 + apple1 + appleDev + student1 + everyStudent + devApple1Student1 + apple2
                + remApple1Student1 + appleTeacher);

        //Распечатать вычисления и итоговый результат: (19)

        int sumLKM = l + k + m;
        m = m++;
        int sumKLMPlusPlus = k + l + m;

        m = m--;
        int sumLKMinusMinus = l + k + m;

        //System.out.println(z);
        //System.out.println(q);
        //System.out.println(m);
        //System.out.println(sumLKM);

        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (sumKLMPlusPlus + sumLKMinusMinus)
                 + " , а разность m++ и  sumLKM = " + (m -sumLKM));

        //Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные. (20)
        System.out.println("" + num48 + " % " + num8 + " = " + num48%num8);
        System.out.println("" + num48 + " % " + 2 + " = " + num48%2);
        System.out.println("" + num8 + " % " + 2 + " = " + num8%2);
        System.out.println("" + 47 + " % " + 2 + " = " + 47%2);
        System.out.println("" + 49 + " % " + 2 + " = " + 49%2);

        System.out.println("   ");

        //Part 3
        //21
        System.out.println("(x+3)² = " + result21);

        System.out.println("    ");

        //22
        System.out.println("3+4x\t10(y-5)(a+b+c)\t\t4\t9+x");
        System.out.println("---- - --------------- + 9(-- + ----) = " + result22);
        System.out.println(" 5  \t\t x\t\t\t    x\t y");

        System.out.println("   ");

        //23
        System.out.println("\t 5x+7y\t 3x-y");
        System.out.println("\t------ : ----");
        System.out.println("\t8x+10y\t  x+y");
        System.out.println("---------------------- = " + result23);
        System.out.println("\t\tc\ta+b");
        System.out.println(" a+b + -- + ---- + ab");
        System.out.println("\t\td\tc+d");

        System.out.println("   ");

        //b
        System.out.println(lineH);
        System.out.println(lineV + " task\t\t" + lineV + " result\t\t" + lineV);
        System.out.println(lineH);
        System.out.println(lineV + " 21\t\t" + lineV + " " + result21 + "\t\t\t" + lineV);
        System.out.println(lineH);
        System.out.println(lineV + " 22\t\t" + lineV + " " + result22 + "\t\t\t" + lineV);
        System.out.println(lineH);
        System.out.println(lineV + " 23\t\t" + lineV + " " + result23 + "\t\t" + lineV);
        System.out.println(lineH);

    }
}
