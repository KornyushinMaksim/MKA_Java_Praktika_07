//        Пользователь вводит с клавиатуры число. Требуется
//        посчитать факториал числа. Например, если введено 3,
//        факториал числа 1*2*3 = 6.
//        Формула для расчета факториала: n! = 1*2*3…*n, где
//        n — число для расчета факториала.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        int fact = 1;

        for (int i = 1; i <= a; i++){
            fact *= i;
        }
        System.out.printf("Факториал числа %d = %d", a, fact);
    }

}
