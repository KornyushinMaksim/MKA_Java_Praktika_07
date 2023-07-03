//        Пользователь вводит с клавиатуры длину линии и
//        символ для заполнения линии. Нужно отобразить на экране
//        вертикальную линию из введенного символа, указанной
//        длины.
//        Например, если было введено 5 и символ %, тогда
//        вывод на экран будет такой:
//        %
//        %
//        %
//        %
//        %

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        System.out.println("Введите символ");
        char sym = in.next().charAt(0);

        for (int i = 0; i < a; i++){
            System.out.println(sym);
        }
    }

}
