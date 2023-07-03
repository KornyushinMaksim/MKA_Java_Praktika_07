//        Пользователь вводит с клавиатуры два числа. Нужно
//        показать все числа в указанном диапазоне.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            System.out.println(i);
        }
    }

}
