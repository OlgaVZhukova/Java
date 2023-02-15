// Написать программу вычисления n-ого треугольного числа.

package Homeworks.HW1;


import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = Scanner.nextInt();
        Scanner.close();
        System.out.printf("Треугольное число = %s", triangle(n));
    }


    static int triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return triangle(num - 1) + num;
    }
}

