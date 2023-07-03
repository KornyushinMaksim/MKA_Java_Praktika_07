//        Найдите корень уравнения
//        cos(x^5) + x^4 - 345.3 * x - 23 = 0
//
//        на отрезке [0; 10] с точностью по x не хуже, чем 0.001.
//        Известно, что на этом промежутке корень единственный.
//        Используйте для этого метод деления отрезка пополам (и рекурсию).

public class NewtonMethod {
    public static void main(String[] args) {
        double min = 0;
        double max = 10;
        Newton method = new Newton();
        System.out.println(method.funcNewton(min, max));
//        double res = Math.cos(Math.pow(x,5)) + Math.pow(x,4) - 345.3 * x -23;
//        System.out.println(res);
    }

}
