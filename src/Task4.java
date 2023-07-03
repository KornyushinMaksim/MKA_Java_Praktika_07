//        Пользователь вводит с клавиатуры два числа. Нужно
//        посчитать сумму чисел в указанном диапазоне, а также
//        среднеарифметическое.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int summ = 0;
        int count = 0;
        int midDig = 0;

        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++){
            summ +=i;
            count++;
        }
        midDig = summ / count;

        System.out.printf("Сумма = %d,\nCреднее значение = %d", summ, midDig);
    }

}
