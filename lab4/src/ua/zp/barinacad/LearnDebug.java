package ua.zp.barinacad;

import java.util.Scanner;

public class LearnDebug {
    public static void main(String[] args) {
        /*
            Task 1
            Решить логические вычисления:
        */
        System.out.println("a. true && false || true && !false ->" + (true && false || true && !false)); //true
        System.out.println("b. false || false || !true && false ->" + (false || false || !true && false)); // false
        System.out.println("c. !false && (false || true && true) ->" + (!false && (false || true && true))); // true
        System.out.println("d. 4 > 8 && !(7 == 0) ->" + (4 > 8 && !(7 == 0))); // false
        System.out.println("e. !(true && false || false && true) && !(true && 4 <= 5) ->" + (!(true && false || false && true) && !(true && 4 <= 5))); // false

        /*
              Task 2
              Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
              и возле каждого пишет четное это число или нечетное.
        */
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i + " -> " + ((i % 2 == 0) ? "Четное" : "Нечетное"));
        }

        /*
            Task 3
            Написать программу, которая выводит информацию о дне неделе.
            Например для понедельника – пятницы выводит сообщение “Это рабочий
            день”, а для субботы и воскресенья выводит “Это выходной!”
         */
        System.out.println("Введите день недели:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim().toLowerCase();
        switch (userInput) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's working day!");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It's weekend");
                break;
            default:
                System.out.println("Wrong week day input : \"" + userInput + "\"");
        }

        /*
        Task 4
        Написать программу, которая считает факториал числа и выводит
        промежуточные значения на экран.
        Условие: если промежуточное значение >1000, завершить цикл предварительно
        написав в консоли “Достигнут максимально возможный результат”.
         */
        System.out.println("Введите число :");
        factorial(scanner.nextInt());

        /*
        Task 5
        Написать программу, которая выводит на экран каждое 3-е i-ое значение цикла
         */
        System.out.println("Введите число :");
        thirdNum(scanner.nextInt());
    }

    /**
     * Подсчет факториала числа
     *
     * @param num
     */
    static void factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
            if (result <= 1000) {
                System.out.println(result);//промежуточный результа
            } else {
                System.out.println("Достигнут максимально возможный результат");
                break;
            }
        }
    }

    /**
     * Вывод каждого третьего i-го числа цикла
     *
     * @param num - максимальное значение
     */
    static void thirdNum(int num) {
        for (int i = 0; i <= num; i += 3) {
            if (i > 0) { //0 - не выводим
                System.out.println("Third :" + i);
            }
        }
    }

}
