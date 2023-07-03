//        Пользователь вводит с клавиатуры два числа. Нужно
//        показать все четные числа в указанном диапазоне.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
