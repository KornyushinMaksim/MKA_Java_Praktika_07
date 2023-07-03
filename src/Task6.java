//        Пользователь вводит с клавиатуры длину линии.
//        Нужно отобразить на экране линию из "*",
//        указанной длины.
//        Например, если было введено 7, тогда вывод на экран
//        будет такой:
//        *******

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();

        for (int i = 0; i < a; i++){
            System.out.print("*");
        }
    }

}
