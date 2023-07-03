//        Пользователь вводит с клавиатурыдва числа (начало и
//        конец диапазона). Требуется проанализировать все числа
//        в этом диапазоне. Вывод на экран должен проходить по
//        правилам, указанным ниже.
//          Если число кратно 3 (делится на 3 без остатка) нужно
//        вывести слово «Fizz». Если число кратно 5 нужно вывести
//        слово «Buzz». Если число кратно 3 и 5 нужно вывести
//        «Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
//        само число.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("Fizz Bizz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

}
