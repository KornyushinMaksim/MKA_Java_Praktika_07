//        Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне.
//        Если границы диапазона указаны неправильно требуется
//        произвести нормализацию границ. Например, пользователь ввел 20 и 11, требуется нормализация после которой
//        начало диапазона станет равно 11, а конец 20.


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++){
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }

}
