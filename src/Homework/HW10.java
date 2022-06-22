package Homework;

import java.util.Locale;

public class HW10 {

    //1.
    public static  String removingSpacesInALine(String line){

        if(line.length() != 0){

            return line.trim();
        }if(line.replaceAll(" ","") != line){

            return "Лишние пробелы удалены";
        }else{

            return "Пробелов не было";
        }

 //       return "“Строка пустая”";
    }

    //2.
    public static String removeAlla(String line){

        if(line.length() != 0){

            return line.toLowerCase().trim().replace("a","");
        }

       return "-1";
    }

    //3.
    public static String removeAllZeros(String line){

        if(line.length() != 0){

            return line.replace(" ","").replace("0","");
        }

        return "-1";
    }

    //4.
    public static String removeAllSpaces(String line){

        if(line.length() != 0){

            return line.replace(" ","");
        }

        return "-1";
    }

    //5.
    public static int counterLetter(String line){

        int counter = 0;

        if (line.length() != 0){

            for (int i = 0; i < line.length(); i++){

                if(line.toLowerCase().substring(i, i + 1).equals("a")){
                    counter++;
                }
            }

            return counter;
        }

        return -1;
    }

    //6.
    public static boolean isTheWordContained (String line){

        if(line.length() != 0){

            return line.toLowerCase().contains("java");

        }

        return false;
    }

    //7.
    public static String addACharacter (String line){

        if (line.length() != 0){

           return line.trim();
        }

        return "-1";
    }

    //8.
    public static String ChangingLowercaseLettersToUppercase(String line){

        if (line.length() != 0){



            line.charAt(0);
            line.toUpperCase();
        }

        return "-1";
    }

    //9.

    public static String SetAParameter(String line, String parameter){

        if (line.length() != 0){


        }

        return "-1";
    }




    public static void main(String[] args){

        //Методы isEmpty(), length(), trim(), replace()

        Utils.taskNumber();
        //1. Написать метод, который принимает на вход строку.
        //Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и
        //в конце строки.+
        //Догадаться, каким методом из видео можно проверить, были ли пробелы.
        //Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
        //Если пробелов не было, вернуть сообщение “Пробелов не было”.
        //Если строка пустая, вернуть сообщение “Строка пустая”.+
        //
        //Test Data:
        //“    QA4Everyone   “ → “Лишние пробелы удалены”
        //“QA4Everyone“ → “Пробелов не было”
        //“” → “Строка пустая”

        removingSpacesInALine("    QA4Everyone   ");

        Utils.taskNumber();
        //2.Написать алгоритм RemoveAlla.
        //С помощью методов из видео1, написать алгоритм, который принимает на вход строку. Если строка валидная, то
        // метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
        //
        //Test Data:
        // “    QA4Everyone   “ →  “QA4Everyone“
        //“panda   “ → “pnd”

        System.out.println(removeAlla("    QA4Everyone   "));
        System.out.println(removeAlla("panda   "));

        Utils.taskNumber();
        //3. Написать алгоритм RemoveAllZeros.
        //С помощью методов из видео1, написать алгоритм, который принимает на вход строку, состоящую из цифр. Если
        //строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
        //строку, в которой нет нулей.
        //Test Data:
        // “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
        //“ 0000000111“ → “111”

        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));
        System.out.println(removeAllZeros(""));

        Utils.taskNumber();
        //4. Написать алгоритм RemoveAllSpaces.
        //С помощью методов из видео1, написать алгоритм, который принимает на вход строку. Если строка валидная, то
        //метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
        //Test Data:
        // “    QA   4  Everyone   “ →  “QA4Everyone“
        //“p a     n d a   “ → “panda”

        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));
        System.out.println(removeAllSpaces(""));

        //Методы charAt(), concat(), contains(), substring(), toLowerCase(), toUpperCase()

        Utils.taskNumber();
        //5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
        //Test Data:
        //“Abracadabra” → 5
        //“Homenum Revelio” → 0

        System.out.println(counterLetter("Abracadabra"));
        System.out.println(counterLetter("Homenum Revelio"));
        System.out.println(counterLetter(""));

        Utils.taskNumber();
        //6. Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java
        //Test Data:
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";

        String textUno = "As a decrepit father takes delight" +
                "To see his active child do deeds of youth," +
                "So I, made lame by fortune’s dearest spite," +
                "Take all my comfort of thy worth and truth." +
                "For whether beauty, birth, or wealth, or wit," +
                "Or any of these all, or all, or more," +
                "Entitled in thy parts do crownèd sit," +
                "I make my love engrafted to this store." +
                "So then I am not lame, poor, nor despised," +
                "Whilst that this shadow doth such substance give" +
                "That I in thy abundance am sufficed," +
                "And by a part of all thy glory live." +
                "Look what is best, that best I wish in thee." +
                "his wish I have; then ten times happy me.” → false";

        System.out.println(isTheWordContained(text));
        System.out.println(isTheWordContained(textUno));
        System.out.println(isTheWordContained(""));

        Utils.taskNumber();
        //7. Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки, точку и кавычки в
        //конце строки с помощью метода concat()
        //Test Data:
        //“One” → ““One.””
        //“    TWO  “ → ““TWO.””

        Utils.taskNumber();
        //8. Напишите метод, кторый принимает на вход название города и исправляет написание:
        //Test Data:
        //“ташкент” → “Ташкент”
        //“ЧикаГО” → “Чикаго”

        Utils.taskNumber();
        //9. Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится между
        //первой и последней буквой-параметром:
        //Test Data:
        //“Abracadabra”, “b” → “bracadab”
        //“Whippersnapper”, “p” → “ppersnapp”

        Utils.taskNumber();
        //10. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
        //на одинаковую букву, и false иначе
        //Test Data:
        //	“Abracadabra” → true
        //	“Whippersnapper” → false




    }
}
