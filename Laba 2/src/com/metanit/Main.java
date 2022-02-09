package com.metanit;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество выполняемых действий: ");
        int n = in.nextInt(); //Количество выполняемый действий.
        System.out.println("Введите значение х: ");
        double x = in.nextDouble();
        double Sum = 0;
        if (n < 0)
            System.out.println("Вы ввели отрицательное число действий ");
        else {
        for (int i = 0; i <= n; i++) {
            double P = Math.pow(-1, n + 1) / (2 * n + 1) * (Math.pow(x, 2 * n + 1));
            Sum = Sum + P;

                System.out.println((Math.PI / 2) + Sum);
            }

        }
        if (n < 0) {

        }
        else {
        System.out.print("Конечный ответ: ");
        System.out.print((Math.PI / 2) + Sum);
    }
}
}


